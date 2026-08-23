class Solution {
    public boolean sumGame(String num) {
        int n = num.length();
        int leftSum = 0, leftQMark = 0;
        int rightSum = 0, rightQMark = 0;

        for(int i = 0; i < n/2; i++){
            char ch = num.charAt(i);
            if(ch == '?'){
                leftQMark++;
            }
            else {
                leftSum += ch - '0';
            }
        }
        for(int i = n/2; i < n; i++){
            char ch = num.charAt(i);
            if(ch == '?'){
                rightQMark++;
            }
            else {
                rightSum += ch - '0';
            }
        }
        int totalQMark = leftQMark + rightQMark;
        if(totalQMark % 2 == 1){
            return true;
        }

        int sumDiff = leftSum - rightSum;
        int QMarkDiff = rightQMark - leftQMark;

        if(sumDiff == 9 * QMarkDiff / 2){
            return false;
        }
        return true;
    }
}