class Solution {
    public int maxProfit(int[] prices) {
        int n = prices.length;
        int minPrice = prices[0];
        int profit = 0;

        for(int i = 1; i < n; i++){
            if(prices[i] < minPrice){
                minPrice = prices[i];
            }
            else {
                while(i < n && prices[i] >= prices[i - 1]){
                    i++;
                }
                profit += prices[i - 1] - minPrice;
                if(i < n) minPrice = prices[i];
            }
        }
        return profit;
    }
}