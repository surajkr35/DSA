class Solution {
    public int[] twoSum(int[] nums, int target) {
        int n = nums.length;
        int[] ans = new int[2];

        Map<Integer, Integer> map = new HashMap<>();

        for(int i = 0; i < n; i++){
            int nums2 = target - nums[i];

            if(map.containsKey(nums2)){
                return new int[]{i, map.get(nums2)};
            }
            map.put(nums[i], i);
        }

        
        return ans;
    }
}