class Solution {
    public int smallestRangeI(int[] nums, int k) {
        int min = nums[0], max = nums[0];
        
        for (int n : nums) {
            min = Math.min(min, n);
            max = Math.max(max, n);
        }
        
        int range = max - min;
        return Math.max(0, range - 2 * k);
    }
}