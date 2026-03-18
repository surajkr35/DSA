class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int current = 0,best = 0;
        for(int i = 0; i< nums.length; i++){
            if(nums[i] == 1){
                current ++;
                best = Math.max(best, current);
            }
            if(nums[i] == 0){
                current=0;
            }
        }
        return best;
    }
}