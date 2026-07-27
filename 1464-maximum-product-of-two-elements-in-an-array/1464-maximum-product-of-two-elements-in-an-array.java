class Solution {
    public int maxProduct(int[] nums) {
        int n = nums.length;
        int max = 0, secMax = 0;

        for(int i = 0; i < n; i++){
            if(nums[i] > secMax){
                if(nums[i] >= max){
                    secMax = max;
                    max = nums[i];
                }
                else {
                    secMax = nums[i];
                }
            }
        }
        return (max - 1) * (secMax - 1);
    }
}