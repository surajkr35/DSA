class Solution {
    public int countKDifference(int[] nums, int k) {
        int[] freq = new int[101]; 
        int count = 0;

        for (int num : nums) {
            if (num + k <= 100) count += freq[num + k];
            if (num - k >= 1)   count += freq[num - k];

            freq[num]++;
        }

        return count;
    }
}

// class Solution {
//     public int countKDifference(int[] nums, int k) {
//         int n = nums.length, count = 0;

//         for (int i = 0; i < n; i++) {
//             for (int j = i+1; j < n; j++) {
//                 if (Math.abs(nums[j] - nums[i]) == k)
//                     count++;
//             }
//         }
//         return count;
//     }
// }