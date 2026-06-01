class Solution {
    public int removeDuplicates(int[] nums) {
        int n = nums.length;
        int count = 1;
        int k = 1;

        for(int i = 1; i < n; i++){
            if(nums[i] != nums[i - 1]){
                count++;

                nums[k++] = nums[i];
            }
        }
        return count;
    }
}