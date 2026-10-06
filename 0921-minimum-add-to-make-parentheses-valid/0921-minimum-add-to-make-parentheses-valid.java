class Solution {
    public int minAddToMakeValid(String s) {
        int n = s.length();
        int count = 0;
        int ans = 0;

        for(char ch : s.toCharArray()){
            if(ch == '('){
                count++;
            }
            else {
                count--;
                if(count < 0){
                    ans++;
                    count = 0;
                }
            }
        }
        return count + ans;
    }
}