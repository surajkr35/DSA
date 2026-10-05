class Solution {
    public int minRotations(int n, String s) {
        int ans = 0;
        int pointer = 0;

        for(int i = 0; i < n; i++){
            int digit = s.charAt(i) - '0';

            ans += dist(pointer, digit);
            pointer = digit;
        }

        int best = ans;

        int last = s.charAt(n - 1) - '0';
        for(int k = 0; k < n; k++){
            int prev = (k == 0) ? 0 : s.charAt(k - 1) - '0';
            int current = s.charAt(k) - '0';

            int oldCost = dist(prev, current);
            int newCost = dist(prev, last);

            best = Math.min(best, ans - oldCost + newCost);
        }

        return best;
    }

    private int dist(int a, int b) {
        int diff = Math.abs(a - b);
        return Math.min(diff, 10 - diff);
    }
}
