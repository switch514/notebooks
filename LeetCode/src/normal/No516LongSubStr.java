package normal;

public class No516LongSubStr {
    public int longestPalindromeSubseq(String s) {

        int n = s.length();
        int [][]dp= new int [n][n];
        char[] chars = s.toCharArray();

        for(int right=0; right<n ;right++){
            dp[right][right] = 1;
            for(int left=right-1; left>=0; left--){
                if(chars[left]==chars[right]){
                    dp[left][right] = dp[left+1][right-1] + 2;
                }else{
                    dp[left][right] = Math.max(dp[left+1][right], dp[left][right-1]);
                }
            }

        }



        return dp[0][n-1];

    }
}
