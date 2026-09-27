class Solution {
    public int[] rearrangeArray(int[] nums) {
        int n = nums.length;
        int max = 0;

        for(int num : nums){
            if(num > max){
                max = num;
            }
        }

        int[] freq = new int[max + 1];

        for(int num : nums){
            freq[num]++;
        }

        int[] ans = new int[n];
        int k = 0;
        while(k < n){
            for(int i = 0; i < freq.length; i++){
                if(freq[i] > 0){
                    ans[k++] = i;
                    freq[i]--;
                }
            }
            
        }
        return ans;
    }
}