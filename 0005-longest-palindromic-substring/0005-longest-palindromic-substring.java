class Solution {
    int start = 0;
    int maxLen = 0;
    public String longestPalindrome(String s) {
        int n = s.length();
        
        for(int i = 0; i < n; i++){
            helper(s, i, i, n);
            helper(s, i, i + 1, n);
        }

        return s.substring(start, start + maxLen);
    }

    private void helper(String s, int left, int right, int n){

        while(left >= 0 && right < n && s.charAt(left) == s.charAt(right)){
            left--;
            right++;
        }

        int len = right - left - 1;
        
        if(len > maxLen){
            maxLen = len;
            start = left + 1;
        }
    }
}