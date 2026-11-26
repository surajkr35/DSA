class Solution {
    public boolean canAliceWin(int n) {
        int i = 10;
        
        while(n >= i){
            n = n - i;
            i--;
        }

        if(i % 2 != 0){
            return true;
        }
        return false;
    }
}