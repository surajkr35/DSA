class Solution {
    public boolean canJump(int[] nums) {
        int n = nums.length;
        int jump = Integer.MIN_VALUE;

        for(int i = 0; i < n; i++){
            if(nums[i] >= jump){
                jump = nums[i];
            }
            else {
                jump--;
            }

            if(jump == 0 && i != n - 1){
                return false;
            }
        }
        return true;
    }
}