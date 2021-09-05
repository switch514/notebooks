package normal;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class Offer46Translate {
    public int translateNum2(int num) {
        String str = String.valueOf(num);
        int [] dp = new int [str.length()+1];
        dp[0] = 1;
        dp[1] = 1;
        for(int i=2;i<= str.length(); i++){
            int n = Integer.parseInt(str.substring(i-2, i));
            if(n>=10 && n<=25){
                dp[i] = dp[i-1] +dp[i-2];
            }
            else{
                dp[i] = dp[i-1];
            }
        }
        return dp[str.length()];
    }

    private HashMap<Integer, String> dic = new HashMap<>();


    public int translateNum(int num) {
        initDic();
        String str = String.valueOf(num);
        Set<String> result = new HashSet<>();
        dfs(0, 1, str, "", result);
        return result.size();
    }

    private void dfs(int l, int r, String str, String curr, Set<String> result) {
        if ((r > (str.length())) || ((r - l) > 2)) {
            return;
        }
        int num = Integer.valueOf(str.substring(l, r));
        if (dic.containsKey(num)) {
            if (r == str.length()) {
                result.add(curr + dic.get(num));
                return;
            } else {
                if (num != 0) {
                    dfs(l, r + 1, str, curr, result);
                }
                dfs(r, r + 1, str, curr + dic.get(num), result);
            }
        } else {
            dfs(l, r + 1, str, curr, result);
        }
    }

    private void initDic() {
        char c = 'a';
        for (int i = 0; i < 26; i++) {
            dic.put(i, String.valueOf(c));
            c++;
        }
    }
}
