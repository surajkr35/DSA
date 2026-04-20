//   Optimized Approach - Greedy     ~ O(n)  Time Complexity

class Solution {
    public int maxDistance(int[] colors) {
        int n = colors.length;

        if(colors[0] != colors[n-1]) return n-1;

        int i = 0;
        while(colors[i] == colors[0]){
            i++;
        }
        int j = n-1;
        while(colors[j] == colors[0]){
            j--;
        }
        int dist = Math.max(j, n-1-i);
        return dist;
    } 
}
//   Brute Force Approach  ~ O(n)  Time Complexity

// class Solution {
//     public int maxDistance(int[] colors) {
//         int n = colors.length;
//         int maxDist = 0;

//         for(int i = 0; i < n; i++){
//             for(int j = i + 1; j < n; j++){
//                 if(colors[i] != colors[j]){
//                     maxDist = Math.max(maxDist, j-i);
//                 }
//             }
//         }
//         return maxDist;
//     }
// }