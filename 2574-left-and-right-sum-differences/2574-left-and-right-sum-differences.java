class Solution {
    public int[] leftRightDifference(int[] nums) {
        int n = nums.length;
        int[] leftSum = new int[n];
        int[] rightSum = new int[n];
        int[] ans = new int[n];
        int totalSum = 0;

        for(int i = 0; i < n; i++){
            totalSum += nums[i];
            leftSum[i] = totalSum - nums[i];
        }

        for(int i = 0; i < n; i++){
            rightSum[i] = totalSum - leftSum[i] - nums[i];
            ans[i] = Math.abs(leftSum[i] - rightSum[i]);
        }

        return ans;
    }
}