class Solution {
    public int countArrays(int[] digitSum) {
        int m = 1_000_000_007;
        int max = 5000; 
        int n = digitSum.length;
        
        int[] dSum = new int[max + 1];
        for (int i = 1; i <= max; i++) {
            dSum[i] = dSum[i / 10] + (i % 10);
        }
        int[] dp = new int[max + 1];
        
        for (int v = 0; v <= max; v++) {
            if (dSum[v] == digitSum[0]) {
                dp[v] = 1;
            }
        }
        for (int i = 1; i < n; i++) {
            int[] nextDp = new int[max + 1];
            int runningSum = 0;
            
            for (int v = 0; v <= max; v++) {
                runningSum = (runningSum + dp[v]) % m;
                
                if (dSum[v] == digitSum[i]) {
                    nextDp[v] = runningSum;
                }
            }
            dp = nextDp; 
        }
        int totalValidArrays = 0;
        for (int v = 0; v <= max; v++) {
            totalValidArrays = (totalValidArrays + dp[v]) % m;
        }
        return totalValidArrays;
    }
}