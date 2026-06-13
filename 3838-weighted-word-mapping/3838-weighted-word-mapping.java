class Solution {
    public String mapWordWeights(String[] words, int[] weights) {
        int n = words.length;
        StringBuilder sb = new StringBuilder();

        for(int i = 0; i < n; i++){
            String s = words[i];
            int sum = 0;

            for(int j = 0; j < s.length(); j++){
                char ch = s.charAt(j);
                sum = sum + weights[ch - 'a'];
            }
            sb.append((char)('z' - (sum % 26)));
        }
        return sb.toString();
    }
}