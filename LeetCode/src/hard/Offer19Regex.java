package hard;

import java.util.ArrayList;
import java.util.List;

public class Offer19Regex {
    private List<MyRegex> myRegexes = new ArrayList<>();

    public boolean isMatch(String s, String p) {
        initRegex(p);

        int sL = s.length();
        int pL = myRegexes.size();

        boolean[][] dp = new boolean[sL + 1][pL + 1];
        dp[0][0] = true;
        for (int i = 0; i <= sL; i++) {
            for (int j = 1; j <= pL; j++) {
                if (myRegexes.get(j - 1).isOptional) {
                    dp[i][j] = dp[i][j - 1];
                    if (myRegexes.get(j - 1).isMatch(s,i)) {
                        dp[i][j] = dp[i][j - 1] | dp[i - 1][j];
                    }
                } else {
                    if (myRegexes.get(j - 1).isMatch(s, i)) {
                        dp[i][j] = dp[i - 1][j - 1];
                    }
                }
            }
        }


        return dp[sL][pL];
    }

    private boolean isLeftRegexOptional(MyRegex currentRegex) {
        if (myRegexes.isEmpty()) {
            return true;
        }
        for (MyRegex regex : myRegexes) {
            if (isSame(regex, currentRegex)) {
                continue;
            }
            if (!regex.isOptional) {
                return false;
            }
        }
        return true;
    }

    private boolean isSame(MyRegex regex, MyRegex currentRegex) {
        if (regex.character == currentRegex.character && currentRegex.isOptional) {
            return true;
        }

        return false;
    }

    private void initRegex(String p) {
        for (int i = 0; i < p.length(); i++) {
            char c = p.charAt(i);
            MyRegex regex = new MyRegex(c);
            if (c == '.') {
                regex.isAllMatch = true;
            }
            if (i < p.length() - 1 && p.charAt(i + 1) == '*') {
                regex.isOptional = true;
                myRegexes.add(regex);
                i++;
            } else {
                myRegexes.add(regex);
            }
        }
    }


    private class MyRegex {
        public boolean isOptional;
        public boolean isAllMatch;
        private char character;

        public MyRegex(char c) {
            character = c;
        }

        public boolean isMatch(String s, int i) {
            if(i<=0){
                return false;
            }
            if (isAllMatch) {
                return true;
            }
            if (s.charAt(i-1) == character) {
                return true;
            }

            return false;
        }
    }
}
