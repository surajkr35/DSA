class Solution {
    public int mostFrequent(int[] nums, int key) {
        int n = nums.length, var = 0;
        int maxCount = 0;

        for(int i = 0; i < n - 1; i++){
            if(nums[i] == key){
                int target = nums[i + 1];
                int count = 0;
                
                for(int j = 0; j < n - 1; j++){
                    if(nums[j] == key && nums[j + 1] == target){
                        count++;
                    }
                }
                if(count > maxCount){
                    maxCount = count;
                    var = target;
                }
            }
        }
        return var;
    }
}