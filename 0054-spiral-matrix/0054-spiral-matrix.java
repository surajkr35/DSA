class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {

        List<Integer> ans = new ArrayList<>(); 

        int m = matrix.length;
        int n = matrix[0].length;

        int topRow = 0;
        int leftColumn = 0;
        int bottomRow = m - 1;
        int rightColumn = n - 1;

        while (topRow <= bottomRow && leftColumn <= rightColumn) {

            // Top Boundary
            for (int i = leftColumn; i <= rightColumn; i++) {
                ans.add(matrix[topRow][i]);   
            }
            topRow++;

            // Right Boundary
            for (int i = topRow; i <= bottomRow; i++) {
                ans.add(matrix[i][rightColumn]);  
            }
            rightColumn--;

            // Bottom Boundary
            if (topRow <= bottomRow) { 
                for (int i = rightColumn; i >= leftColumn; i--) {
                    ans.add(matrix[bottomRow][i]);
                }
                bottomRow--;
            }

            // Left Boundary
            if (leftColumn <= rightColumn) {  
                for (int i = bottomRow; i >= topRow; i--) {
                    ans.add(matrix[i][leftColumn]);
                }
                leftColumn++;
            }
        }

        return ans;  
    }
}
