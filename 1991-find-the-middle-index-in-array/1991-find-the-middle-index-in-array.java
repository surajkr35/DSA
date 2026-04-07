class Solution {
    public int findMiddleIndex(int[] nums) {
        int n = nums.length, sum = 0, rightSum = 0, leftSum = 0;
        for(int i = 0; i < n; i++){
            sum += nums[i];
        }

        for(int i = 0; i < n; i++){
            leftSum += nums[i];
            rightSum = sum - leftSum + nums[i];
            if(leftSum == rightSum) return i;
        }

        return -1;
    }
}