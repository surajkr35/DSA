class Solution {
    public int[][] cyclicShift(int n, int[][] grid, int[] rowShift, int[] colShift) {
        int[][] row = new int[n][n];
        int[][] col = new int[n][n];

        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                int k = (j - rowShift[i] + n) % n;
                row[i][k] = grid[i][j];
            }
        }
        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                int k = (i - colShift[j] + n) % n;
                col[k][j] = row[i][j];
            }
        }
        return col;
    }    
}
    