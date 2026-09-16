class Solution {
    public String minWindow(String s, String t) {
        int n1 = s.length();
        int n2 = t.length();

        if(n2 > n1){
            return "";
        }
        int[] freq = new int[128];

        for(char ch : t.toCharArray()){
            freq[ch]++;
        }

        int left = 0;
        int count = t.length();

        int start = 0;
        int minLen = Integer.MAX_VALUE;

        for(int right = 0; right < n1; right++){
            char ch = s.charAt(right);

            if(freq[ch] > 0){
                count--;
            }
            freq[ch]--;

            while(count == 0){
                char leftChar = s.charAt(left);
                freq[leftChar]++;

                if(right - left + 1 < minLen){
                    minLen = right - left + 1;
                    start = left;
                }

                if(freq[leftChar] > 0){
                    count++;
                }
                left++;

            }
        }
        if(minLen == Integer.MAX_VALUE){
            return "";
        }
        return s.substring(start, start + minLen);
    }
}