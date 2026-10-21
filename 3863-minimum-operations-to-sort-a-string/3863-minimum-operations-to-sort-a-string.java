class Solution {
    public int minOperations(String s) {
        int n = s.length();
        if(n == 1){
            return 0;
        }

        boolean isSort = true;

        for(int i = 1; i < n; i++){
            if(s.charAt(i) < s.charAt(i - 1)){
                isSort = false;
                break;
            }
        }

        if(isSort){
            return 0;
        }
        if(n == 2){
            return -1;
        }

        char minChar = 'z';
        char maxChar = 'a';

        for(char c : s.toCharArray()){
            minChar = (char) Math.min(minChar, c);
            maxChar = (char) Math.max(maxChar, c);
        }

        if(minChar == s.charAt(0) || maxChar == s.charAt(n - 1)){
            return 1;
        }

        for(int i = 1; i < n - 1; i++){
            if(s.charAt(i) == minChar || s.charAt(i) == maxChar){
                return 2;
            }
        }

        return 3;
    }
}