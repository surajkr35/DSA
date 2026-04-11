class Solution {
    public int minimumCost(int[] cost) {
        int n = cost.length, sum = 0, diff = 0;
        Arrays.sort(cost);

        for(int i = 0; i < n; i++){
            sum += cost[i];
        }
        for(int i = n-3; i >= 0; i-=3){
            diff += cost[i];
        }

        return sum-diff;
    }
}