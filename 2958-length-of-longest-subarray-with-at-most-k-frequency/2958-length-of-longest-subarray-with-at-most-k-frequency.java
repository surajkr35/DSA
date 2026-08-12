class Solution {
    public int maxSubarrayLength(int[] nums, int k) {
        int n = nums.length;
        Map<Integer, Integer> map = new HashMap<>();
        int maxLen = 0, x = 0;

        for(int i = 0; i < n; i++){
            map.put(nums[i], (map.getOrDefault(nums[i] , 0) + 1));
            
            while(map.get(nums[i]) > k){
                map.put(nums[x], map.get(nums[x]) - 1);
                x++;
            }
            
            maxLen = Math.max(maxLen, i - x + 1);
        }

        return maxLen;
    }
}