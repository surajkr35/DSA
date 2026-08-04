class Solution {
    public int minPatches(int[] nums, int n) {
        int x = nums.length;
        long sum = 0;
        int count = 0;

        for(int i = 0; i < x; i++){
            if(sum >= n) break;
            else if(nums[i] > sum + 1){
                count++;
                sum = sum + sum + 1;
                i--;
            }
            else if(nums[i] <= sum + 1){
                sum = sum + nums[i];
            }
        }
        while(sum < n){
            sum = sum + sum + 1;
            count++;
        }
        return count;
    }
}
