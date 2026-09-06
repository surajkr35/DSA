class Solution {
    public int countRotations(String s, int k) {
        int n = s.length();
        int count = 0;

        for(int i = 0; i < n; i++){
            if(s.charAt(i) == s.charAt((i + 1) % n)){
                count++;
            }
        }

        int diff = n - count;

        if(k == count){
            return diff;
        }
        if(k == count - 1){
            return count;
        }

        return 0;
    }
}