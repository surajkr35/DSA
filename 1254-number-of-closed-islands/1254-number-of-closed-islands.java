class Solution {
    private void dfs(int[][] grid, int i, int j, int m, int n){
        if(i < 0 || j < 0 || i >= m || j >= n || grid[i][j] == 1){
            return;
        }

        grid[i][j] = 1;

        dfs(grid, i + 1, j, m, n);
        dfs(grid, i - 1, j, m, n);
        dfs(grid, i,  j + 1, m, n);
        dfs(grid, i, j - 1, m, n);
    }

    public int closedIsland(int[][] grid) {
        int m = grid.length;
        int n = grid[0].length;
        int count = 0;

        for(int i = 0; i < m; i++){
            dfs(grid, i, 0, m, n);
            dfs(grid, i, n - 1, m, n);
        }

        for(int i = 1; i < n - 1; i++){
            dfs(grid, 0, i, m, n);
            dfs(grid, m - 1, i, m, n);
        }

        for(int i = 0; i < m; i++){
            for(int j = 0; j < n; j++){
                if(grid[i][j] == 0){
                    count++;
                    dfs(grid, i, j, m, n);
                }
            }
        }

        return count;
    }
}