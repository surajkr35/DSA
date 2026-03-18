class Solution {
    public void moveZeroes(int[] nums) {
        int n = nums.length;
        int a = 0;
        for(int i = 0; i<n; i++){
            if(nums[i] != 0){
                int temp = nums[a];
                nums[a] = nums[i];
                nums[i] = temp;
                a++;
            }
        }
    }
}