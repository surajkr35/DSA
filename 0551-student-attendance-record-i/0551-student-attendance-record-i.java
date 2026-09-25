class Solution {
    public boolean checkRecord(String s) {
        int n = s.length();
        int abs = 0;
        int late = 0;

        for(int i = 0; i < n; i++){
            char ch = s.charAt(i);

            if(ch == 'A'){
                abs++;
                if(abs > 1){
                    return false;
                }
                late = 0;
            }
            else if(ch == 'L'){
                late++;
                
                if(late >= 3){
                    return false;
                }
            }
            else {
                late = 0;
            }
        }
        return true;
    }
}