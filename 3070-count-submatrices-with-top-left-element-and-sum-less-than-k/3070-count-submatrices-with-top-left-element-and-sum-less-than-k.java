class Solution {
    public static int countSubmatrices(int[][] grid, int k) {
        int r = grid.length;
        int c = grid[0].length;

        int cnt = 0;
        int brCol = c;

        if (grid[0][0] > k) return 0;

        cnt++;

        for (int j = 1; j < c; j++) {
            grid[0][j] += grid[0][j - 1];
            if (grid[0][j] > k) {
                brCol = j;
                break;
            }
            cnt++;
        }

        for (int i = 1; i < r; i++) {
            grid[i][0] += grid[i - 1][0];
            if (grid[i][0] > k) break;

            cnt++;

            for (int j = 1; j < brCol; j++) {
                grid[i][j] += grid[i - 1][j] 
                            + grid[i][j - 1] 
                            - grid[i - 1][j - 1];

                if (grid[i][j] > k) {
                    brCol = j;
                    break;
                }

                cnt++;
            }
        }

        return cnt;
    }
}