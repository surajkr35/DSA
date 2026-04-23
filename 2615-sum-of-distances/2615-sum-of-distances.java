class Solution {
    public long[] distance(int[] nums) {
        int n = nums.length;
        long[] res = new long[n];

        Map<Integer, List<Integer>> map = new HashMap<>();

        for (int i = 0; i < n; i++) {
            map.computeIfAbsent(nums[i], k -> new ArrayList<>()).add(i);
        }
        for (List<Integer> idx : map.values()) {
            int k = idx.size();

            long left = 0;
            long right = 0;

            for (int i = 0; i < k; i++) {
                right += idx.get(i) - idx.get(0);
            }

            for (int i = 0; i < k; i++) {
                int currentIndex = idx.get(i);
                res[currentIndex] = left + right;

                if (i + 1 < k) {
                    int gap = idx.get(i + 1) - idx.get(i);

                    left += (long) gap * (i + 1);
                    right -= (long) gap * (k - i - 1);
                }
            }
        }
        
        return res;
    }
}