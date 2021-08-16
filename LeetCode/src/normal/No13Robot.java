package normal;

public class No13Robot {
    int movingCount(int m, int n, int k) {
        int count = 1;

        boolean [][] state = new boolean[m][n];
        state[0][0] = true;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (isReachable(i, j, k) && hasNeibour(i,j,state)) {
                    count++;
                    state[i][j] = true;
                }
            }
        }
        return count;
    }

    private boolean hasNeibour(int m, int n, boolean[][] state) {
        if(m - 1 >=0 && m<= state.length-1){
            if(state[m-1][n]==true){
                return true;
            }
        }

        if(n-1>=0 && n<=state[0].length-1){
            if(state[m][n-1]==true){
                return true;
            }
        }
        return false;
    }



    int movingCountDfs(int m, int n, int k) {
        boolean [][]state = new boolean[m][n];

        return dfs(0,0,k,state);
    }

    private int dfs(int m, int n, int k, boolean[][] state) {
        if( (m> state.length-1) || (n>state[0].length-1)){
            return 0;
        }
        if(state[m][n] == true){
            return 0;
        }
        if(!isReachable(m,n,k)){
            return 0;
        }
        state[m][n] = true;

        return 1 + dfs(m+1,n, k,state) + dfs(m,n+1,k,state);
    }

    private boolean isReachable(int m, int n, int k) {
        int sum = m / 10 + m % 10 + n / 10 + n % 10;
        if (sum > k) {
            return false;
        }
        return true;
    }
}
