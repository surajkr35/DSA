class Solution {
    public int countElements(int[] nums) {
        int n = nums.length, count = 0;
        int max = Integer.MIN_VALUE, min = Integer.MAX_VALUE;
        
        for(int i = 0; i < n; i++){
            if(nums[i] > max) max = nums[i];
            if(nums[i] < min) min = nums[i];
        }
        if(max == min) return 0;

        for(int i = 0; i < n; i++){
            if(nums[i] == max || nums[i] == min) count++;
        }
        return n-count;
    }
}