class Solution {
    public int unequalTriplets(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        int n = nums.length;

        for(int num : nums){
            map.put(num, map.getOrDefault(num, 0) + 1);
        }
        int ans = 0;
        int a = 0;

        for (int b : map.values()) {
            int c = n - a - b;
            ans += a * b * c;
            a += b;
        }

        return ans;
        
    }
}

// class Solution {
//     public int unequalTriplets(int[] nums) {
//         int n = nums.length, count = 0;

//         for(int i = 0; i < n; i++){
//             for(int j = i+1; j < n; j++){
//                 for(int k = j+1; k < n; k++){
//                     if(nums[i] != nums[j] && nums[j] != nums[k] && nums[i] != nums[k]){
//                         count++;
//                     }
//                 }
//             }
//         }
//         return count;
//     }
// }