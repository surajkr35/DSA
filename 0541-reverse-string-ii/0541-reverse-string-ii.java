class Solution {
    public String reverseStr(String s, int k) {
        int n = s.length();
        char[] ch = s.toCharArray();
        int start = 0;
        int end = start + k - 1;
        if(k >= n){
            end = n - 1;
        }

        while(start < n){
            reverse(ch, start, end);
            start += 2*k;
            end = start + k - 1;
            if(end > n - 1){
                end = n - 1;
            }
        }

        return new String(ch);
    }

    private void reverse(char[] ch, int l, int r){
        while(l < r){
            char temp = ch[l];
            ch[l] = ch[r];
            ch[r] = temp;

            l++;
            r--;
        }
    }
}