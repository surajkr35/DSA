class Solution {
    public int[] lastVisitedCell(char[][] grid) {
        int m = grid.length;
        int n = grid[0].length;
        int[] ans = new int[2];

        int i = 0;
        int j = 0;

        while(i >= 0 && i < m && j >= 0 && j < n && grid[i][j] != 'X'){
            char ch = grid[i][j];
            grid[i][j] = 'X';
            ans[0] = i;
            ans[1] = j;

            if(ch == 'R'){
                j = j + 1;
            }
            else if(ch == 'L'){
                j = j - 1;
            }
            else if(ch == 'U'){
                i = i - 1;
            }
            else {
                i = i + 1;
            }

        }
        return ans;
    }
}