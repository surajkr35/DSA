class Solution {
    public int numOfStrings(String[] patterns, String word) {
        int n = patterns.length;
        int count = 0;

        for(int i = 0; i < n; i++){
            String str = patterns[i];

            if(word.contains(str)){
                count++;
            }
        }
        return count;
    }
}