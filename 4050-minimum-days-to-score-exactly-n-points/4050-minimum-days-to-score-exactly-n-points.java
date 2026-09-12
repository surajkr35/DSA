class Solution {
    public int minDays(int n) {
        int[] sum = new int[448];
        sum[0] = 0;
        
        for(int i = 1; i < 448; i++){
            sum[i] = sum[i-1] + i;
        }

        int[] dp = new int[n + 1];

        for(int i = 1; i <= n; i++){
            dp[i] = Integer.MAX_VALUE;
        } 

        for(int i = 1; i <= n; i++){
            for(int j = 1; j < 448 && sum[j] <= i; j++){
                int r = i - sum[j];
                int day = j;

                if(r > 0){
                    day++;
                }
                day += dp[r];
                dp[i] = Math.min(dp[i], day);
            }

        }
        return dp[n];
    }

}