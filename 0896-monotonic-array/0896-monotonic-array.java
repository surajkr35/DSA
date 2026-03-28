// class Solution {
//     public boolean isMonotonic(int[] nums) {
//         int n = nums.length;
//         if (nums[0] <= nums[n - 1]) {
//             for (int i = 0; i < n - 1; i++) {
//                 if (nums[i] > nums[i + 1]) {
//                     return false;
//                 }
//             }
//         } else {
//             for (int i = 0; i < n - 1; i++) {
//                 if (nums[i] < nums[i + 1]) {
//                     return false;
//                 }
//             }
//         }
//         return true;
//     }
// }
class Solution {
    public boolean isMonotonic(int[] nums) {
        boolean increasing = true;
        boolean decreasing = true;

        for(int i = 0; i < nums.length - 1; i++){
            if(nums[i] < nums[i+1]) decreasing = false;
            if(nums[i] > nums[i+1]) increasing = false;
        }

        return increasing || decreasing;
    }
}