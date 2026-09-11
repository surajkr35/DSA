class Solution {
    public int climbStairs(int n, int[] costs) {
        int[] dp = new int[n+1];
        dp[0] = 0;
        dp[1] = costs[0] + 1;
        if(n > 1){
            dp[2] = Math.min(dp[1] + 1, dp[0] + 4) + costs[1];
        }
        if(n > 2){
            dp[3] = Math.min(dp[0] + 9, Math.min(dp[1] + 4, dp[2] + 1)) + costs[2];
        }

        for(int i = 4; i <= n; i++){
            dp[i] = Math.min(dp[i-1] + 1, Math.min(dp[i-2] + 4, dp[i-3] + 9)) + costs[i-1];
        }
        
        return dp[n];
    }
}