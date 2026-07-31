class Solution {
    public int minimumPushes(String word) {
        int n = word.length();
        int[] freq = new int[26];

        for(int i = 0; i < n; i++){
            freq[word.charAt(i) - 'a']++;
        }

        Arrays.sort(freq);
        int count = 0;
        int push = 0;

        for(int i = 25; i >= 0; i--){
            if(freq[i] != 0){
                push += freq[i] * (count / 8 + 1);
                count++;
            }
        }
        
        return push;
    }
}