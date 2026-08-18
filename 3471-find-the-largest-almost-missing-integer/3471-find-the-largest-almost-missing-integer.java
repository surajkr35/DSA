class Solution {
    public int largestInteger(int[] nums, int k) {
        int n = nums.length;
        int[] freq = new int[51];

        for(int num : nums){
            freq[num]++;
        }

        if(k == 1){
            for(int i = 50; i >= 0; i--){
                if(freq[i] == 1){
                    return i;
                }
            }
            return -1;
        }

        if(k == n){
            for(int i = 50; i >= 0; i--){
                if(freq[i] > 0){
                    return i;
                }
            }
        }
        if(freq[nums[0]] == 1 && freq[nums[n - 1]] == 1){
            return Math.max(nums[0] , nums[n - 1]);
        }
        else if(freq[nums[0]] == 1){
            return nums[0];
        }
        else if(freq[nums[n - 1]] == 1){
            return nums[n - 1];
        }
        return -1;
    }
}