package hard;

import java.util.ArrayList;
import java.util.List;

public class Offer19Regex {
    private List<MyRegex> myRegexes = new ArrayList<>();

    public boolean isMatch(String s, String p) {
        initRegex(p);

        int sL = s.length();
        int pL = myRegexes.size();

        boolean[][] dp = new boolean[sL][pL];
        dp[0][0] = myRegexes.get(0).isMatch(s.charAt(0));
        for (int i = 1; i < sL; i++) {
            if (myRegexes.get(0).isOptional) {
                dp[i][0] = dp[i - 1][0] | dp[i][0];
            } else {
                dp[i][0] = false;
            }

            for (int j = 1; j < pL; j++) {
                if (myRegexes.get(j).isMatch(s.charAt(i))) {
                    if (myRegexes.get(j - 1).isOptional) {
                        dp[i][j] = dp[i][j - 1];
                    } else {
                        dp[i][j] = dp[i - 1][j - 1] | dp[i][j];
                    }

                } else {
                    if (myRegexes.get(j).isOptional) {
                        dp[i][j] = dp[i - 1][j - 1] | dp[i][j];
                    } else {
                        dp[i][j] = false;
                    }
                }
            }
        }


        return dp[sL - 1][pL - 1];
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

        public boolean isMatch(char c) {
            if (isAllMatch) {
                return true;
            }
            if (c == character) {
                return true;
            }

            return false;
        }
    }
}
