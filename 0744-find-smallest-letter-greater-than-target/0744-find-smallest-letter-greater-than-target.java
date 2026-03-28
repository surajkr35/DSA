class Solution {
    public char nextGreatestLetter(char[] letters, char target) {
        int n = letters.length;
        int beg = 0, end = n - 1;

        while (beg <= end) {
            int mid = beg + (end - beg) / 2;
            if (letters[mid] <= target) {
                beg = mid + 1;
            } else {
                end = mid - 1;
            }
        }

        return letters[beg % n];
    }
}