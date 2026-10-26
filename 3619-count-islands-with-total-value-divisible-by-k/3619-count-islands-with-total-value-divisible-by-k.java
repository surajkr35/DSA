class Solution {
    long sum = 0;

    public int countIslands(int[][] grid, int k) {
        int m = grid.length;
        int n = grid[0].length;
        int ans = 0;

        for(int i = 0; i < m; i++){
            for(int j = 0; j < n; j++){
                if(grid[i][j] != 0){
                    dfs(grid, i, j, m, n);
                    if(sum % k == 0){
                        ans++;
                    }
                    sum = 0;
                }
            }
        }
        
        return ans;
    }

    private void dfs(int[][] grid, int i, int j, int m, int n){
        if(i < 0 || i >= m || j < 0 || j >= n || grid[i][j] == 0){
            return;
        }

        sum += grid[i][j];
        grid[i][j] = 0;

        dfs(grid, i + 1, j, m, n);
        dfs(grid, i - 1, j, m, n);
        dfs(grid, i, j + 1, m, n);
        dfs(grid, i, j - 1, m, n);
    }
}