class Solution {
    public int numberOfSpecialChars(String word) {
        int n = word.length();
        int count = 0;

        boolean[] visited = new boolean[26];

        for (int i = 0; i < n; i++) {
            int ch = word.charAt(i);

            if (Character.isUpperCase(ch) && !visited[ch - 'A']) {

                for (int j = 0; j < n; j++) {

                    if (word.charAt(j) == ch + 32) {
                        count++;
                        visited[ch - 'A'] = true;
                        break;
                    }
                }
            }
        }

        return count;
    }
}