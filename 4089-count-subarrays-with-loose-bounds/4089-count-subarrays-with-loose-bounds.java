class Solution {
    public long countSubarrays(int[] nums, int minK, int maxK) {
        int n = nums.length;
        long cnt = 0;
        int idx = 0;

        for(int i = 0; i < n; i++){
            if(nums[i] >= minK && nums[i] <= maxK){
                cnt += i - idx + 1;
            }
            else {
                idx = i + 1;
            }
        }

        return cnt;
    }
}