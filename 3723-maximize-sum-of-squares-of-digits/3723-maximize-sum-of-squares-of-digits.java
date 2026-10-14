class Solution {
    public String maxSumOfSquares(int num, int sum) {
        StringBuilder ans = new StringBuilder();
        int n = sum / 9;
        int x = sum % 9;

        if(9 * num < sum){
            return "";
        }

        for(int i = 0; i < n; i++){
            ans.append('9');
        }

        if(x > 0){
            ans.append((char) ('0' + x));
        }

        while(ans.length() < num){
            ans.append('0');
        }
        return ans.toString();
    }
}