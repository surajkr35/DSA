class Solution {
    public boolean checkPerfectNumber(int num) {

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