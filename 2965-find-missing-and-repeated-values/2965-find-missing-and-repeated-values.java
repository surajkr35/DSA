class Solution {
    public int[] findMissingAndRepeatedValues(int[][] grid) {
        int n = grid.length;
        int[] arr = new int[n*n];
        int[] ans = new int[2];
        int x = 0;
        int expSum = (n*n)*(n*n + 1)/2;
        int uniqueSum = 0;
        
        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                arr[x++] = grid[i][j];
            }
        }
        Arrays.sort(arr);

        int arrSum = uniqueSum = arr[0];
        for(int i = 1; i < n*n; i++){
            arrSum = arrSum + arr[i];
            if(arr[i] != arr[i-1]){
                uniqueSum = uniqueSum + arr[i];
            }
        }
    ans[0] = arrSum - uniqueSum;
    ans[1] = expSum - uniqueSum;

    return ans;
    }
}