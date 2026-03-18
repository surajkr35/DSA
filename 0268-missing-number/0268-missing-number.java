class Solution {
    public int missingNumber(int[] nums) {
        int n = nums.length;
        int sum = 0;
        int sum_upto_n = n*(n+1)/2;
        for(int i = 0; i < n; i++){
            sum = sum + nums[i];
        }
        int missing = sum_upto_n - sum;

        return missing;
    }
}