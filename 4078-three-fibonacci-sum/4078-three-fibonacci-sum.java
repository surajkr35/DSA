class Solution {
    public boolean threeFibonacciSum(int n) {
        if(n < 2 || n % 2 != 0){
            return false;
        }
        int a = 0;
        int b = 1;
        int c = 1;
        
        while(c <= n / 2){
            c = a + b;
            a = b;
            b = c;

            if(c == n / 2){
                return true;
            }
        }
        return false;
    }
}