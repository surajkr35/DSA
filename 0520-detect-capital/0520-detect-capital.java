class Solution {
    public boolean detectCapitalUse(String word) {
        int n = word.length();

        if(word.charAt(0) >= 'A' && word.charAt(0) <= 'Z'){
            boolean allUpper = true;
            boolean allLower = true;

            for(int i = 1; i < n; i++){
                char ch = word.charAt(i);

                if(ch >= 'a' && ch <= 'z'){
                    allUpper = false;
                }

                if(ch >= 'A' && ch <= 'Z'){
                    allLower = false;
                }
            }

            return allUpper || allLower;
        }
        for(int i = 1; i < n; i++){
            char ch = word.charAt(i);

            if(ch >= 'A' && ch <= 'Z'){
                return false;
            }
        }

        return true;
    }
}
