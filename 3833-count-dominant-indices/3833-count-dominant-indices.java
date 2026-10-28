class Solution {
    public int dominantIndices(int[] nums) {
        int n = nums.length;
        int sum = 0;
        int ans = 0;

        for(int i = n - 2; i >= 0; i--){
            sum += nums[i + 1];
            if(nums[i] > sum / (n - i - 1)){
                ans++;
            }
        }
        
        return ans;
    }
}