class Solution {
    public String smallestPalindrome(String s) {
        int n = s.length();
        int[] freq = new int[26];

        for(int i = 0; i < n; i++){
            freq[s.charAt(i) - 'a']++;
        }
        char middle = 0;
        StringBuilder left = new StringBuilder();

        for(int i = 0; i < 26; i++){
            if(freq[i] > 1){
                int count = freq[i] / 2;
                while(count-->0){
                    left.append((char) (i + 'a'));
                }

                
            }
            if(freq[i] % 2 != 0){
                middle = (char) (i + 'a');
            }
        }
        StringBuilder ans = new StringBuilder(left);
        if(middle != 0){
            ans.append(middle);
        }
        ans.append(left.reverse());

        return ans.toString();
    }
}