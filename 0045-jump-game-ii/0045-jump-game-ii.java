class Solution {
    public int jump(int[] nums) {
        int n = nums.length;
        int count = 1;
        if(n == 1){
            return 0;
        }

        int idx = 0;
        int jump = nums[0];
        int newIdx = 0;
        int maxJump = 0;

        while(jump < n - 1){
            for(int i = idx + 1; i <= jump && i < n; i++){
                if(nums[i] + i > maxJump){
                    maxJump = nums[i] + i;
                    newIdx = i;
                }
            }

            jump = maxJump;
            idx = newIdx;
            count++;
        }

        return count;
    }
}