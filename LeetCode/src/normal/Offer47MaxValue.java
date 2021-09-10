package normal;

public class Offer47MaxValue {
    public int maxValue(int[][] grid) {
        if (null == grid || grid.length == 0) {
            return 0;
        }
        int[][] dp = new int[grid.length][grid[0].length];

        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                if (i == 0 && j == 0) {
                    dp[0][0] = grid[0][0];
                    continue;
                }
                if (i == 0 && j > 0) {
                    dp[i][j] = dp[i][j - 1] + grid[i][j];
                    continue;
                }
                if (j == 0 && i > 0) {
                    dp[i][j] = dp[i - 1][j] + grid[i][j];
                    continue;
                }
                dp[i][j] = Math.max(dp[i - 1][j], dp[i][j - 1]) + grid[i][j];
            }
        }

        return dp[grid.length - 1][grid[0].length - 1];
    }



/*  overtime

 private int maxValue;

    public int maxValue(int[][] grid) {
        if (null == grid || grid.length == 0) {
            return 0;
        }

        dfs(grid, 0, 0, 0);
        return maxValue;
    }

    private void dfs(int[][] grid, int row, int col, int value) {
        if (row >= grid.length || col >= grid[0].length) {
            return;
        }

        if (row == grid.length - 1 && col == grid[0].length - 1) {
            value = value + grid[row][col];
            maxValue = Math.max(value, maxValue);
        } else {
            dfs(grid, row + 1, col, value + grid[row][col]);
            dfs(grid, row, col + 1, value + grid[row][col]);
        }
    }
    */

}
