class Solution {
    public boolean checkPerfectNumber(int num) {
        // for a number to be perfect number
        // n = 2^(p−1) × (2^p − 1)  
        // p must be prime number  ---- 2 , 3 , 5 , 7 ....
        
        int[] primes = {2, 3, 5, 7, 13};
        for (int p : primes) {
            int m = (int)Math.pow(2, p) - 1;
            int perfect = (int)Math.pow(2, p - 1) * m;

            if (perfect == num) {
                return true;
            }
        }
        return false;
    }
}
// 