class Solution {
    public int climbStairs(int n, int[] costs) {
        int dp1 = 0;
        int dp2 = 0;
        int dp3 = 0;

        for(int i = 1; i <= n; i++){
            int curr = Math.min(dp1 + 9, Math.min(dp2 + 4, dp3 + 1)) + costs[i-1];
            dp1 = dp2;
            dp2 = dp3;
            dp3 = curr;
        }

        return dp3;
    }
}