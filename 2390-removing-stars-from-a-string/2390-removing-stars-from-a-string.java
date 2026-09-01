class Solution {
    public String removeStars(String s) {
        int n = s.length();
        StringBuilder sb = new StringBuilder();

        for(int i = 0; i < n; i++){
            char ch = s.charAt(i);

            if(ch == '*'){
                if(sb.length() > 0){
                    sb.deleteCharAt(sb.length() - 1);
                }
                
            }
            else {
                sb.append(ch);
            }
        }
        return sb.toString();
    }
}