class Solution {
    public String[] largestString(int[] nums) {
        int n = nums.length;
        String[] ans = new String[n];
        long[] arr = new long[26];
        arr[0] = 1;

        for(int i = 1; i < 26; i++){
            arr[i] = arr[i-1] * 2;
        }

        for(int i = 0; i < n; i++){
            int num = nums[i];
            StringBuilder sb = new StringBuilder();

            while(num > 0){
                for(int j = 25; j >= 0; j--){
                    if(arr[j] <= num){
                        sb.append((char) (j + 'a'));
                        num = num - (int) arr[j];
                        break;
                    }
                }
            }
            ans[i] = sb.toString();
        }

        return ans;
    }
}