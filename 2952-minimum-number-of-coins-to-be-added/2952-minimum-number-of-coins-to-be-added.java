class Solution {
    public int minimumAddedCoins(int[] coins, int target) {
        int n = coins.length;
        Arrays.sort(coins);
        int sum = 0;
        int count = 0;

        for(int i = 0; i < n; i++){
            if(sum >= target) break;
            else if(coins[i] > sum + 1){
                count++;
                sum = sum + sum + 1;
                i--;
            }
            else if(coins[i] <= sum + 1){
                sum = sum + coins[i];
            }
        }
        while(sum < target){
            sum = sum + sum + 1;
            count++;
        }
        return count;
    }
}