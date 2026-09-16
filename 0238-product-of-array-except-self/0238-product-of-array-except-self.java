class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int[] ans = new int[n];
        int product = 1;
        int countZero = 0;
        int productWithoutZero = 1;
        int idxZero = 0;

        for(int i = 0; i < n; i++){
            product *= nums[i];
            if(nums[i] == 0){
                countZero++;
                idxZero = i;
            }
            else {
                productWithoutZero *= nums[i];
            }
        }
        if(countZero > 1){
            return ans;
        }
        if(countZero == 1){
            ans[idxZero] = productWithoutZero;
        }
        else {
            for(int i = 0; i < n; i++){
              
                ans[i] = product / nums[i];
            }
        }
        return ans;
    }
}