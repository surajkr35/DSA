class Solution {
    public int dominantIndex(int[] nums) {
        int max = Integer.MIN_VALUE, secMax = Integer.MIN_VALUE, index = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > secMax) {
                if (nums[i] > max) {
                    secMax = max;
                    max = nums[i];
                    index = i;
                }
                else {
                    secMax = nums[i];
                }
            }
        }
        if (max >= 2 * secMax)
            return index;
        else
            return -1;
    }
}