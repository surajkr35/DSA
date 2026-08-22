class Solution {
    public boolean checkDivisibility(int n) {
        int digSum = 0;
        int digProduct = 1;
        int x = n;

        while(x > 0){
            int r = x % 10;
            digSum = digSum + r;
            digProduct = digProduct * r;
            x /= 10;
        }

        return n % (digSum + digProduct) == 0;
    }
}