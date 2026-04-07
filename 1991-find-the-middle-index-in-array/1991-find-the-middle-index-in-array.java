class Solution {
    public int findMiddleIndex(int[] nums) {
        int n = nums.length, sum = 0, curSum = 0;
        for(int i = 0; i < n; i++){
            sum += nums[i];
        }

        for(int i = 0; i < n; i++){
            curSum += nums[i];
            if(curSum == sum - curSum + nums[i]) return i;
        }

        return -1;
    }
}