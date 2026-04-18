// class Solution {
//     public String[] sortPeople(String[] names, int[] heights) {
//         int n = names.length;
//         int[][] arr = new int[n][2];

//         for (int i = 0; i < n; i++) {
//             arr[i][0] = heights[i];
//             arr[i][1] = i;
//         }
//         Arrays.sort(arr, (a, b) -> b[0] - a[0]);
//         String[] ans = new String[n];

//         for (int i = 0; i < n; i++) {
//             ans[i] = names[arr[i][1]];
//         }
//         return ans;
//     }
// }
class Solution {
    public String[] sortPeople(String[] names, int[] heights) {
        HashMap <Integer, String> map = new HashMap<>();
        String[] ans = new String[heights.length];

        for(int i = 0; i < heights.length; i++){
            map.put(heights[i], names[i]);
        }
        Arrays.sort(heights);
        int x = 0;
        for(int i = heights.length - 1; i >= 0; i--){
            ans[x++] = map.get(heights[i]);
        }
        return ans;
    }
}