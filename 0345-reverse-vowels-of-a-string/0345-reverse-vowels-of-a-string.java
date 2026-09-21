class Solution {
    public String reverseVowels(String s) {
        int n = s.length();
        boolean[] checkVowel = new boolean[128];

        for(char c : "aeiouAEIOU".toCharArray()){
            checkVowel[c] = true;
        }

        int left = 0;
        int right = n - 1;
        char[] words = s.toCharArray();

        while(left < right){
            while(left < right && checkVowel[words[left]] == false){
                left++;
            }
            while(left < right && checkVowel[words[right]] == false){
                right--;
            }
            
            char temp = words[left];
            words[left] = words[right];
            words[right] = temp;

            left++;
            right--;
        }

        return new String(words);
    }
}