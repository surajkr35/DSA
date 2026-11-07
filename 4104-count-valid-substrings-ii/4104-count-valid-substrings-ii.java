class Solution {
    public long countValidSubstrings(String s) {
        int n = s.length();
        long count = 0;
        int a = -1, b = -1, c = -1;

        for(int i = 0; i < n; i++){
            char ch = s.charAt(i);
            if(ch == 'a'){
                a = i;
            }
            else if(ch == 'b'){
                b = a;
            }
            else {
                c = b;
            }

            count += i - c;
        }
        return count;
    }
}