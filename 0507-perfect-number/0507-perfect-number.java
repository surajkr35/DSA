class Solution {
    public boolean checkPerfectNumber(int num) {
        if (num <= 1)
            return false;
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return checkForNonPrime(num);
            }
        }
        return false;

    }

    private boolean checkForNonPrime(int x) {
        int sum = 0;
        for (int i = 1; i <= x / 2; i++) {
            if (x % i == 0) {
                sum = sum + i;
            }
        }
        if (sum == x) {
            return true;
        }
        return false;
    }
}