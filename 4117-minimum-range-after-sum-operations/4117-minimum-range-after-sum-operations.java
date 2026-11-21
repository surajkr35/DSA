class Solution {
    public int minRange(int a, int b, int c) {
        int[] nums = {a, b, c};

        Arrays.sort(nums);

        int s = nums[0];
        int m = nums[1];
        int l = nums[2];

        int range = l - s;

        return Math.min(range, m);
    }
}