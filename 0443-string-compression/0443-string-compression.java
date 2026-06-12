class Solution {
    public int compress(char[] chars) {
        int n = chars.length;
        int count = 1;
        int k = 0;

        for(int i = 0; i < n; i++){
            if(i < n - 1 && chars[i] == chars[i + 1]){
                count++;
            }
            else{
                chars[k++] = chars[i];

                if(count > 1){
                    for(char c : String.valueOf(count).toCharArray()){
                        chars[k++] = c;
                    }
                }

                count = 1;
            }
        }

        return k;
    }
}