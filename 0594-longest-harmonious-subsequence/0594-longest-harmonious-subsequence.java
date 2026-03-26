class Solution {
    public int findLHS(int[] nums) {
        Arrays.sort(nums);  // Step 1: sort the array
        int start = 0;
        int maxLen = 0;

        for (int end = 0; end < nums.length; end++) {
            // Move start to keep difference <= 1
            while (nums[end] - nums[start] > 1) {
                start++;
            }
            // Update maxLen only if difference == 1
            if (nums[end] - nums[start] == 1) {
                maxLen = Math.max(maxLen, end - start + 1);
            }
        }

        return maxLen;
    }
}