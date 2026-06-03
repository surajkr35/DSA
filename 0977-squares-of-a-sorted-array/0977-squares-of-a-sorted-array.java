class Solution {
    public int[] sortedSquares(int[] nums) {
        int n = nums.length;
        int[] ans = new int[n];
        int neg = 0, pos = 0;

        if(nums[0] >= 0){
            for(int i = 0; i < n; i++){
                ans[i] = nums[i] * nums[i];
            }
        }
        else if(nums[n - 1] < 0){
            for(int i = 0; i < n; i++){
                ans[i] = nums[n-1-i] * nums[n-1-i];
            }
        }    
        else {
            for(int i = 0; i < n; i++){
                if(nums[i] < 0 && nums[i + 1] >= 0){
                    neg = i;
                    pos = i + 1;
                    break;
                }
            }
            int i = 0;
            while(neg >= 0 && pos <= n-1){
                if(Math.abs(nums[neg]) < nums[pos]){
                    ans[i++] = nums[neg] * nums[neg];
                    neg--;
                    if(neg < 0){
                        while(pos <= n-1){
                            ans[i++] = nums[pos] * nums[pos];
                            pos++;
                        }
                    }
                }
                else{
                    ans[i++] = nums[pos] * nums[pos];
                    pos++;
                    if(pos > n-1){
                        while(neg >= 0){
                            ans[i++] = nums[neg] * nums[neg];
                            neg--;
                        }
                    }
                }
            }
        }
        return ans;
    }
}