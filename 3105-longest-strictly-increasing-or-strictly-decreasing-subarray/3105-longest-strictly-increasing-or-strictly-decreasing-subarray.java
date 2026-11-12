class Solution {
    public int longestMonotonicSubarray(int[] nums) {
        int n = nums.length;
        int len = 1;
        int maxLen = 1;

        for(int i = 1; i < n; i++){
            if(nums[i] > nums[i - 1]){
                len++;
                maxLen = Math.max(maxLen, len);
            }
            else {
                len = 1;
            }
        }
        len  = 1;
        for(int i = 1; i < n; i++){
            if(nums[i] < nums[i - 1]){
                len++;
                maxLen = Math.max(maxLen, len);
            }
            else {
                len = 1;
            }
        }

        return maxLen;
    }
}