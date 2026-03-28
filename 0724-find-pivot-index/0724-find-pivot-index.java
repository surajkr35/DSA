class Solution {
    public int pivotIndex(int[] nums) {
        int n = nums.length;
        int totSum = 0, leftSum = 0, rightSum = 0;
        for(int i = 0; i < nums.length; i++){
            totSum += nums[i];
        }
        if(totSum - nums[0] == 0) return 0;
        for(int i = 1; i < n; i++){
            leftSum += nums[i-1];
            rightSum = totSum - leftSum - nums[i];
            if(leftSum == rightSum) return i;
        }
        return -1;
    }
}