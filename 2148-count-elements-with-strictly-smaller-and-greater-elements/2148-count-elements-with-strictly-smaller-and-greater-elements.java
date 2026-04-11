class Solution {
    public int countElements(int[] nums) {
        int n = nums.length, count = 2;;
        Arrays.sort(nums);
        
        for(int i = 1; i < n; i++){
            if(nums[i] != nums[i-1]){
                break;
            }
            count++;
        }
        for(int i = n-1; i > 0; i--){
            if(nums[i] != nums[i-1]){
                break;
            }
            count++;
        }
        return n-count < 0 ? 0 : n-count;
    }
}