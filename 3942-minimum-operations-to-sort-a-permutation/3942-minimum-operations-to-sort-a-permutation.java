class Solution {
    public int minOperations(int[] nums) {
        int n = nums.length;
        int zeroIdx = 0;
        int ans = Integer.MAX_VALUE;

        for(int i = 0; i < n; i++){
            if(nums[i] == 0){
                zeroIdx = i;
                break;
            }
        }

        if(check(nums, zeroIdx, 1)){
            ans = Math.min(zeroIdx, n - zeroIdx + 2);
        }

        if(check(nums, zeroIdx, -1)){
            ans = Math.min(ans, zeroIdx + 2);
            ans = Math.min(ans, n - zeroIdx);
        }

        if(ans == Integer.MAX_VALUE){
            return -1;
        }

        return ans;
    }

    private boolean check(int[] nums, int zeroIdx, int step) {
        int n = nums.length;

        for(int i = 1; i < n; i++){
            int prev = (zeroIdx + (i - 1) * step + n) % n;
            int curr = (zeroIdx + i * step + n) % n;

            if(nums[prev] > nums[curr]){
                return false;
            }
        }

        return true;
    }
}