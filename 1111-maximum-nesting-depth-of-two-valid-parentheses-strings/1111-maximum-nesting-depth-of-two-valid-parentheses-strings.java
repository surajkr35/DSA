class Solution {
    public int[] maxDepthAfterSplit(String seq) {
        int n = seq.length();
        int count = 0;
        int[] ans = new int[n];

        for(int i = 0; i < n; i++){
            char ch = seq.charAt(i);

            if(ch == '('){
                count++;
                if(count % 2 == 0){
                    ans[i] = 1;
                }
                else {
                    ans[i] = 0;
                }
            }
            else{
                if(count % 2 == 0){
                    ans[i] = 1;
                }
                else {
                    ans[i] = 0;
                }
                count--;
            }
            
        }
        return ans;
    }
}