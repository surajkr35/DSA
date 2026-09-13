class Solution {
    public int minPathSum(int[][] grid) {
        int m = grid.length;
        int n = grid[0].length;
        int[][] dp = new int[m][n];
        for(int[] row : dp){
            Arrays.fill(row, Integer.MAX_VALUE);
        }

        dp[m-1][n-1] = grid[m-1][n-1];

        return helper(grid, 0, 0, m, n, dp);
    }
    private int helper(int[][] nums, int i, int j, int m, int n, int[][] dp){
        if(i >= m || j >= n){
            return Integer.MAX_VALUE;
        }
        if(dp[i][j] != Integer.MAX_VALUE){
            return dp[i][j];
        }

        int right = helper(nums, i, j + 1, m, n, dp);
        int down = helper(nums, i + 1, j, m, n, dp);

        dp[i][j] = Math.min(right, down) + nums[i][j];

        return dp[i][j];
    }
}