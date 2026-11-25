class Solution {
    public int rob(int[] nums) {
        int n = nums.length;
        int[] dp = new int[n];
        dp[0] = nums[0];
        if(n > 1) {
            dp[1] = Math.max(nums[0], nums[1]);
        }
        
        for(int i = 2; i < n; i++){
            dp[i] = Math.max(nums[i] + dp[i - 2], dp[i - 1]);
        }

        return dp[n - 1];
    }
}

// class Solution {
//     public int rob(int[] nums) {
//         int n = nums.length;
//         int[] dp = new int[n];

//         Arrays.fill(dp, - 1);

//         return helper(nums, 0, dp);
//     }

//     private int helper(int[] nums, int idx, int[] dp){
//         if(idx >= nums.length){
//             return 0;
//         }

//         if(dp[idx] != -1){
//             return dp[idx];
//         }

//         int rob = nums[idx] + helper(nums, idx + 2, dp);
//         int skip = helper(nums, idx + 1, dp);

//         return dp[idx] = Math.max(rob, skip);
//     }
// }