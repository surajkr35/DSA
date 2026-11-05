class Solution {
    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
        if(image[sr][sc] == color){
            return image;
        }

        helper(image, sr, sc, color, image[sr][sc]);

        return image;
    }

    private void helper(int[][] image, int i, int j, int color, int orgCol) {
        if(i < 0 || j < 0 || i >= image.length || j >= image[0].length 
             || image[i][j] != orgCol){
            return;
        }

        image[i][j] = color;

        helper(image, i - 1, j, color, orgCol);
        helper(image, i + 1, j, color, orgCol);
        helper(image, i, j - 1, color, orgCol);
        helper(image, i, j + 1, color, orgCol);
    }
}