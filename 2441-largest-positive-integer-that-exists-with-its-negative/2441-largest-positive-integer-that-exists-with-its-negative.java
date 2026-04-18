//   Using HashSet   ~ O(n) Time Complexity
class Solution {
    public int findMaxK(int[] nums) {
        HashSet <Integer> set = new HashSet<>();
        for(int num : nums){
            set.add(num);
        }
        int ans = -1;
        for(int num : set){
            if(set.contains(-num)){
                ans = Math.max(ans,num);
            }
        } 
        return ans;
    }
}
//   Using Sorting & 2-Pointers    ~ O(nlogn) Time Complexity 

// class Solution {
//     public int findMaxK(int[] nums) {
//         Arrays.sort(nums);

//         int i = 0, j = nums.length - 1;
//         int ans = -1;

//         while (i < j) {
//             int sum = nums[i] + nums[j];

//             if (sum == 0) {
//                 ans = Math.max(ans, nums[j]);
//                 i++;
//                 j--;
//             } 
//             else if (sum < 0) {
//                 i++;
//             } 
//             else {
//                 j--;
//             }
//         }
//         return ans;
//     }
// }