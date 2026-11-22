class Solution {
    public boolean checkString(String s) {
        int count = 0;

        for(char ch : s.toCharArray()){
            if(ch == 'b'){
                count++;
            }
            else {
                if(count > 0){
                    return false;
                }
            }
        }
        
        return true;
    }
}