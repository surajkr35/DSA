class Solution {
    public int minOperations(int[] nums, int[] locked, int k) {
        int n = nums.length;
        int ans = 0;

        for(int i = 0; i < n; i++){
            for(int j = i + 1; j < n; j++){
                if(nums[i] > nums[j]){
                    ans++;
                }
            }
        }

        boolean[] idx = new boolean[n];
        int m = 0;

        for(int i = 0; i < n - 1; i++){
            m = Math.max(m, nums[i]);

            if(m > i + 1){
                if(locked[i] == 1){
                    idx[i] = true;
                }

                if(locked[i + 1] == 1){
                    idx[i + 1] = true;
                }
            }
        }

        int unlock = 0;

        for(int i = 0; i < n; i++){
            if(idx[i]){
                unlock++;
            }
            
            if(unlock > k){
                return -1;
            }
        }

        return ans + unlock;
    }
}