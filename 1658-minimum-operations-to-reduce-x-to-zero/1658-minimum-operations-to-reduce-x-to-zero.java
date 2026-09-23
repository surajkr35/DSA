class Solution {
    public int minOperations(int[] nums, int x) {
        int n = nums.length;
        int totalSum = 0;

        for(int i = 0; i < n; i++){
            totalSum += nums[i];
        }

        int target = totalSum - x;
        if(target < 0){
            return -1;
        }

        if(target == 0){
            return n;
        }

        int left = 0;
        int sum = 0;
        int maxLen = -1;

        for(int i = 0; i < n; i++){
            sum += nums[i];
            while(sum > target){
                sum -= nums[left];
                left++;
            }

            if(sum == target){
                maxLen = Math.max(maxLen, i - left + 1);
            }
        }
        return maxLen == -1 ? -1 : n - maxLen;
    }
}