class Solution {
    public int longestSubsequence(int[] nums) {
        int n = nums.length;
        int xor = nums[0];
        boolean allZero = nums[0] == 0;

        for(int i = 1; i < n; i++){
            if(nums[i] != 0) allZero = false;
            xor = xor ^ nums[i];
        }
        if(xor != 0) return n;
        
        if(allZero) return 0;

        return n-1;
    }
}