class Solution {
    public int findGCD(int[] nums) {
        int n = nums.length;
        int max = Integer.MIN_VALUE, min = Integer.MAX_VALUE;
        int GCD = 1;

        for(int i = 0; i < n; i++){
            if(nums[i] > max){
                max = nums[i];
            }
            if(nums[i] < min){
                min = nums[i];
            }
        }

        for(int i = min; i > 0; i--){
            if(min % i == 0 && max % i == 0){
                GCD = i;
                break;
            }
        }
        return GCD;
    }
}