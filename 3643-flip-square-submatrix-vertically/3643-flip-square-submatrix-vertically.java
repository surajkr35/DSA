class Solution {
    public int[][] reverseSubmatrix(int[][] grid, int x, int y, int k) {

        for (int i = y; i < y + k; i++) {
            int top = x;
            int bottom = k + x - 1;
            while (top < bottom) {
                int temp = grid[top][i];
                grid[top][i] = grid[bottom][i];
                grid[bottom][i] = temp;
                top++;
                bottom--;
            }
        }
        return grid;
    }
}