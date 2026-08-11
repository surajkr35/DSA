class Solution {
    public int missingInteger(int[] nums) {
        int n = nums.length;
        int sum = nums[0];
        
        for(int i = 0; i < n-1; i++){
            if(nums[i] + 1 == nums[i+1]){
                sum += nums[i+1];
            }
            else {
                break;
            }
        }
        while(true){
            boolean found = false;

            for(int num : nums){
                if(num == sum){
                    found = true;
                    break;
                }
            }
            if(!found){
                    return sum;
                }
                sum++;
        }
        
    }
}