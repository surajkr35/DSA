class Solution {
    public int sumCounts(List<Integer> nums) {
        int n = nums.size();
        Set<Integer> set = new HashSet<>();
        int sum = 0;

        for(int i = 0; i < n; i++){
            for(int j = i; j < n; j++){
                set.add(nums.get(j));
                sum = sum + (set.size() * set.size());
            }
            set.clear();
        }

        return sum;
    }
}