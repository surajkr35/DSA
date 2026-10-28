class Solution {
    int min = Integer.MAX_VALUE;

    public int minCost(int[][] grid) {
        int m = grid.length;
        int n = grid[0].length;
        boolean[][][] vis = new boolean[m][n][1024];

        helper(grid, 0, 0, m, n, 0, vis);

        return min;
    }

    private void helper(int[][] grid, int i, int j, int m, int n, int xor, boolean[][][] vis){
        if(i >= m || j >= n){
            return;
        }

        xor = xor ^ grid[i][j];

        if(vis[i][j][xor]){
            return;
        }

        if(i == m - 1 && j >= n - 1){
            min = Math.min(min, xor);
            return;
        }
        vis[i][j][xor] = true;

        helper(grid, i + 1, j, m, n, xor, vis);
        helper(grid, i, j + 1, m, n, xor, vis);
    }
}