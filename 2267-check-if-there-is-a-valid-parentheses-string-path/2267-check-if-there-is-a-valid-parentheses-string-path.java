class Solution {
    Boolean[][][] dp;

    public boolean hasValidPath(char[][] grid) {
        int m = grid.length;
        int n = grid[0].length;

        if(grid[0][0] == ')' || grid[m - 1][n - 1] == '('){
            return false;
        }

        dp = new Boolean[m][n][m + n];

        return helper(grid, 0, 0, 0);
    }

    private boolean helper(char[][] grid, int i, int j, int count){
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
        
        boolean right = helper(grid, i, j + 1, count);
        boolean down = helper(grid, i + 1, j, count);

        dp[i][j][count] = right || down;

        return dp[i][j][count];
    }
}