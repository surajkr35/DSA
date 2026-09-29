class Solution {
    public String countAndSay(int n) {
        if(n == 1){
            return "1";
        }

        String num = "1";
        for(int i = 1; i < n; i++){
            num = helper(num);
        }

        return num;
    }
    private String helper(String num){
        int n = num.length();
        StringBuilder sb = new StringBuilder();
        int cons = 1;

        for(int i = 0; i < n - 1; i++){
            if(num.charAt(i) == num.charAt(i + 1)){
                cons++;
            }
            else {
                sb.append(cons);
                sb.append(num.charAt(i));
                cons = 1;
            }
        }
        sb.append(cons);
        sb.append(num.charAt(n - 1));

        return sb.toString();
    }
}