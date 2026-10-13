class Solution {
    public long maxAlternatingSum(int[] nums) {
        int n = nums.length;

        for(int i = 0; i < n; i++){
            if(nums[i] < 0){
                nums[i] = -nums[i];
            }
        }
        long neg = 0;
        long pos = 0;

        Arrays.sort(nums);

        for(int i = 0; i < n / 2; i++){
            neg += nums[i] * nums[i];
        }
        for(int i = n / 2; i < n; i++){
            pos += nums[i] * nums[i];
        }

        return pos - neg;
    }
}