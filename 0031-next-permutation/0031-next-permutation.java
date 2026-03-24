class Solution {
    public void nextPermutation(int[] nums) {
        int n = nums.length, i = n - 2;

        // Step 1: Find first decreasing element from the end
        while (i >= 0 && nums[i] >= nums[i + 1]) i--;

        // Step 2: If found, swap with just larger element on right
        if (i >= 0) {
            int j = n - 1;
            while (nums[j] <= nums[i]) j--;
            swap(nums, i, j);
        }

        // Step 3: Reverse the suffix
        reverse(nums, i + 1, n - 1);
    }

    private void swap(int[] nums, int i, int j) {
        int t = nums[i]; nums[i] = nums[j]; nums[j] = t;
    }

    private void reverse(int[] nums, int start, int end) {
        while(start < end) swap(nums, start++, end--);
    }
}