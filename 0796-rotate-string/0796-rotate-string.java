class Solution {
    public boolean rotateString(String s, String goal) {
        int n = s.length();
        int m = goal.length();
        if (n != m) return false;

        for (int start = 0; start < n; start++) {
            int i = start;
            int j = 0;

            while (j < m && s.charAt(i % n) == goal.charAt(j)) {
                i++;
                j++;
            }

            if (j == n) return true;
        }

        return false;
    }
}