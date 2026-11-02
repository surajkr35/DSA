class Solution {
    public int minMoves2(int[] nums) {
        int n = nums.length;
        int ans = 0;

        Arrays.sort(nums);
        int mid = n / 2;

        for(int i = 0; i < n; i++){
            ans += Math.abs(nums[i] - nums[mid]);
        }

        return ans;
    }
}