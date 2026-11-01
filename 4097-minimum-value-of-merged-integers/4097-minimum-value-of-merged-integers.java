class Solution {
    public int minMergedInteger(int[] nums) {
        int n = nums.length;
        int ans = Integer.MAX_VALUE;

        for(int i = 0; i < n; i+=2){
            String num = String.valueOf(nums[i]) + String.valueOf(nums[i + 1]);

            int x = Integer.parseInt(num);

            ans = Math.min(ans, x);
        }

        return ans;
    }
}