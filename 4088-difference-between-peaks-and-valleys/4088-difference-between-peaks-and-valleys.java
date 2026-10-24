class Solution {
    public int peakValleyDifference(int[] nums) {
        int n = nums.length;
        int sumPeak = 0;
        int sumVal = 0;

        for(int i = 1; i < n - 1; i++){
            if(nums[i] > nums[i - 1] && nums[i] > nums[i + 1]){
                sumPeak += nums[i];
            }
            else if(nums[i] < nums[i - 1] && nums[i] < nums[i + 1]){
                sumVal += nums[i];
            }
        }
        return sumPeak - sumVal;
    }
}