class Solution {
    public boolean hasValidPath(char[][] grid) {
        int m = grid.length;
        int n = grid[0].length;

        if(grid[0][0] == ')' || grid[m - 1][n - 1] == '('){
            return false;
        }

        Boolean[][][] dp = new Boolean[m][n][m + n];

        return helper(grid, 0, 0, 0, dp);
    }

    private boolean helper(char[][] grid, int i, int j, int count, Boolean[][][] dp){
        if(i >= grid.length || j == grid[0].length){
            return false;
        }

        if(grid[i][j] == '('){
            count++;
        }
        else if(grid[i][j] == ')'){
            count--;

            if(count < 0){
                return false;
            }
        }

        if(i == grid.length - 1 && j == grid[0].length - 1){
            return count == 0;
        }

        if(dp[i][j][count] != null) {
            return dp[i][j][count];
        }
        
        boolean right = helper(grid, i, j + 1, count, dp);
        boolean down = helper(grid, i + 1, j, count, dp);

        dp[i][j][count] = right || down;

        return dp[i][j][count];
    }
}