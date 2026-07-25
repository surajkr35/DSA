class Solution {
    public int maxProduct(int n) {
        int maxOne = Integer.MIN_VALUE;
        int maxSec = Integer.MIN_VALUE;
        while(n > 0){
            int r = n % 10;
            n = n / 10;
            if(r > maxSec){
                if(r > maxOne){
                    maxSec = maxOne;
                    maxOne = r;
                }
                else {
                    maxSec = r;
                }
            }
        }
        return maxOne * maxSec;
    }
}