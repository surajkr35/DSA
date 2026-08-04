class Solution {
    public List<Integer> findMissingElements(int[] nums) {
        int n = nums.length;
        List<Integer> ans = new ArrayList<>();
        Set<Integer> set = new HashSet<>();
        int min = Integer.MAX_VALUE, max = Integer.MIN_VALUE;

        for(int i = 0; i < n; i++){
            if(nums[i] > max) max = nums[i];
            if(nums[i] < min) min = nums[i];
            set.add(nums[i]);
        }

        for(int i = min + 1; i < max; i++){
            if(!set.contains(i)){
                ans.add(i);
            }
        }
        return ans;
    }
}