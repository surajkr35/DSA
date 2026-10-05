class Solution {
    public int minRotations(String s) {
        int ans = 0;
        int pointer = 0;

        for(char ch : s.toCharArray()){
            int diff = Math.abs(pointer - (ch - '0'));
            ans += Math.min(diff, 10 - diff);

            pointer = ch - '0';
        }

        return ans;
    }
}