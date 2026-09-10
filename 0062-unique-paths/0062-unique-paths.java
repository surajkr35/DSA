class Solution {
    public int uniquePaths(int m, int n) {
        int[][] temp = new int[m][n];
        if(m == 1 || n == 1){
            return 1;
        }

        temp[0][0] = 0;
        for(int i = 1; i < m; i++){
            temp[i][0] = 1;
        }
        for(int i = 1; i < n; i++){
            temp[0][i] = 1;
        }

        for(int i = 1; i < m; i++){
            for(int j = 1; j < n; j++){
                temp[i][j] = temp[i-1][j] + temp[i][j-1];
            }
        }
        return temp[m-1][n-1];
    }
    
}
// ____________________________________________________

    // ~ Using the Permutation and Combinations (MATHS)

// class Solution {
//     public int uniquePaths(int m, int n) {
//         int k = Math.min(m - 1, n - 1);
//         long result = 1;

//         for(int i = 1; i <= k; i++){
//             result = result * (m + n - 2 - k + i) / i;
//         }

//         return (int) result;
//     }
// }
