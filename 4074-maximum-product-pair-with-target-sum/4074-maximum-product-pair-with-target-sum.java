class Solution {
    public int[] maxProductPair(int[] nums, int target) {
        int n = nums.length;
        int[] ans = new int[2];
        Arrays.fill(ans, - 1);
        int max = Integer.MIN_VALUE;

        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                if(i == j) continue;
                if(nums[j] + nums[i] == target){
                    if(nums[j] * nums[i] > max && nums[i] > nums[j]){
                        max = nums[i] * nums[j];
                        ans[0] = i;
                        ans[1] = j;
                    }
                }
            } 
        }
        return ans;
    }
}