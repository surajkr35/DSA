class Solution {
    public int firstMissingPositive(int[] nums) {
        int n = nums.length;

        for(int i = 0; i < n; i++){
            while(nums[i] >= 0 && nums[i] != i+1){
                int idx = nums[i]-1;
                if(idx < 0 || idx >= n || nums[i] == nums[idx]) break;
                int temp = nums[idx];
                nums[idx] = nums[i];
                nums[i] = temp;
            }
        }

        for(int i = 0; i < n; i++){
            if(nums[i] != i+1){
                return i+1;
            }

        }
        return n+1;
    }
}