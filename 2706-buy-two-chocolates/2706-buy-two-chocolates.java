class Solution {
    public int buyChoco(int[] prices, int money) {
        int minPrice = Integer.MAX_VALUE;
        int secMinPrice = Integer.MAX_VALUE;

        for(int price : prices){
            if(price < secMinPrice){
                if(price < minPrice){
                    secMinPrice = minPrice;
                    minPrice = price;
                }
                else {
                    secMinPrice = price;
                }
            }
        }
        int cost = minPrice + secMinPrice;
        int moneyLeft = money - cost;

        return moneyLeft >= 0 ? moneyLeft : money;
    }
}