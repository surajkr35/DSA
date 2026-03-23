class Solution {
    public int maxProductPath(int[][] grid) {
        int MOD = 1_000_000_007;
        int m = grid.length, n = grid[0].length;

        long[] maxDp = new long[n];
        long[] minDp = new long[n];

        // Initialize first cell
        maxDp[0] = minDp[0] = grid[0][0];

        // First row
        for (int j = 1; j < n; j++) {
            maxDp[j] = minDp[j] = maxDp[j - 1] * grid[0][j];
        }

        // Process remaining rows
        for (int i = 1; i < m; i++) {
            // First column
            maxDp[0] = minDp[0] = maxDp[0] * grid[i][0];

            for (int j = 1; j < n; j++) {
                long val = grid[i][j];

                long topMax = maxDp[j];
                long topMin = minDp[j];
                long leftMax = maxDp[j - 1];
                long leftMin = minDp[j - 1];

                long maxVal = Math.max(
                        Math.max(val * topMax, val * topMin),
                        Math.max(val * leftMax, val * leftMin));

                long minVal = Math.min(
                        Math.min(val * topMax, val * topMin),
                        Math.min(val * leftMax, val * leftMin));

                maxDp[j] = maxVal;
                minDp[j] = minVal;
            }
        }

        long result = maxDp[n - 1];
        return result >= 0 ? (int) (result % MOD) : -1;
    }
}