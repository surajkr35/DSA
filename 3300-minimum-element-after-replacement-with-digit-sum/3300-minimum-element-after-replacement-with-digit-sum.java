class Solution {
    public int minElement(int[] nums) {
        int n = nums.length;
        int ans = Integer.MAX_VALUE;
        
        for(int i = 0; i < n; i++){
            int x = nums[i];
            int sum = 0;
            while(x > 0){
                int r = x % 10;
                sum += r;
                x /= 10;
            }
            ans = Math.min(ans, sum);
        }
        return ans;
    }
}