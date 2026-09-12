class Solution {
    public int lengthOfLIS(int[] nums) {
        int n = nums.length;
        int[][] dp = new int[n][n+1];

        return helper(nums, dp, 0, -1);

    }
    private int helper(int[] nums, int[][] dp, int curr, int prev){
        if(curr == nums.length){
            return 0;
        }
        if(dp[curr][prev + 1] != 0){
            return dp[curr][prev + 1];
        }
        int take = 0;
        if(prev == -1 || nums[curr] > nums[prev]){
            take = 1 + helper(nums, dp, curr + 1, curr);
        }
        int skip = helper(nums, dp, curr + 1, prev);

        dp[curr][prev + 1] = Math.max(take, skip);

        return dp[curr][prev + 1];
    }
}