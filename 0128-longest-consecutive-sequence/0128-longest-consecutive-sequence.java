class Solution {
    public int longestConsecutive(int[] nums) {
        if(nums.length == 0) return 0;  // handle empty array

        Arrays.sort(nums);

        int max = 1;
        int count = 1;
        for(int i = 1; i < nums.length; i++){
            if(nums[i] == nums[i-1] + 1 || nums[i] == nums[i-1]){
                if(nums[i] == nums[i-1]){
                    continue;  // skip duplicates
                } else {
                    count++;  // consecutive number found
                }
                max = Math.max(max, count);
            } else {
                count = 1;  // sequence breaks
            }
        }
        return max;
    }
}