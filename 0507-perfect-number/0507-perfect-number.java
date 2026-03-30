class Solution {
    public boolean checkPerfectNumber(int num) {
        int[] primes = {2, 3, 5, 7, 13};

        for (int p : primes) {
            int mersenne = (int)Math.pow(2, p) - 1;
            int perfect = (int)Math.pow(2, p - 1) * mersenne;

            if (perfect == num) {
                return true;
            }
        }
        return false;
    }
}