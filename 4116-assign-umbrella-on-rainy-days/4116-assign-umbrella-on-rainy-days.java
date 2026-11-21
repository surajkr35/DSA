class Solution {
    public String[] assignUmbrella(int[] rain) {
        int n = rain.length;

        int alice = 0;
        int bob = 0;
        String[] ans = new String[n];

        for(int i = 0; i < n; i++){
            if(rain[i] == 0){
                ans[i] = "None";
                continue;
            }

            boolean need = i < n - 1 && rain[i + 1] == 1;

            if(!need){
                ans[i] = "Bob";
                bob++;
            }
            else if(alice <= bob){
                ans[i] = "Alice";
                alice++;
            }
            else {
                ans[i] = "Bob";
                bob++;
            }
        }

        return ans;
    }
}