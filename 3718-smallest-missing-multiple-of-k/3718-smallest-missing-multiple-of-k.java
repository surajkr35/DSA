    // ~  Without Using HashSet  - O(1) Space Complexity

class Solution {
    public int missingMultiple(int[] nums, int k) {
        int n = nums.length;

        for(int mul = k; ; mul += k){
            boolean found = false;
            for(int i = 0; i < n; i++){
                if(nums[i] == mul){
                    found = true;
                    break;
                }
            }
            if(!found){
                return mul;
            }
        }
    }
}
//   ~ Using HashSet  - O(n) Time Complexity & O(n) Space Complexity

// class Solution {
//     public int missingMultiple(int[] nums, int k) {
//         Set<Integer> set = new HashSet<>();

//         for(int num : nums){
//             if(num % k == 0){
//                 set.add(num);
//             }
//         }
//         int n = k;
//         for(int i = 0; i < set.size(); i++){
//             if(!set.contains(k)){
//                 return k;
//             }
//             k += n;
//         }

//         return k;
//     }
// }