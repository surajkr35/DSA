class Solution {
    public int maxProduct(int[] nums) {
        int n = nums.length;
        int max = nums[0], secMax = 0, min = nums[0], secMin = 0;

        for(int i = 1; i < n; i++){
            if(nums[i] > secMax){
                if(nums[i] >= max){
                    secMax = max;
                    max = nums[i];
                }
                else {
                    secMax = nums[i];
                }
            }

            if(nums[i] < secMin){
                if(nums[i] <= min){
                    secMin = min;
                    min = nums[i];
                }
                else {
                    secMin = nums[i];
                }
            }
        }
        return Math.max(((max - 1) * (secMax - 1)), ((min - 1) * (secMin - 1)));
    }
}