class Solution {
    public long maxDifference(int[] nums) {
        int n = nums.length;
        long[] dp = new long[n + 2];

        for(int i = n - 1; i >= 0; i--){
            long sum1 = nums[i];

            long op1;

            if(sum1 % 3 == 0){
                op1 = sum1 - dp[i + 1];
            }
            else{
                op1 = sum1 + dp[i + 1];
            }

            long op2 = Integer.MIN_VALUE;

            if(i + 1 < n){
                long sum2 = nums[i] + (long) nums[i + 1];

                if(sum2 % 3 == 0){
                    op2 = sum2 - dp[i + 2];
                }
                else {
                    op2 = sum2 + dp[i + 2];
                }
            }

            dp[i] = Math.max(op1, op2);
        }
        return dp[0];
    }
}