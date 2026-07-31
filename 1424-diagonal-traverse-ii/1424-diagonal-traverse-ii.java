class Solution {
    public int[] findDiagonalOrder(List<List<Integer>> nums) {
        Map<Integer, List<Integer>> map = new HashMap<>();
        int total = 0;
        int maxDiagonal = 0;

        for (int i = 0; i < nums.size(); i++) {
            for (int j = 0; j < nums.get(i).size(); j++) {
                int d = i + j;
                map.computeIfAbsent(d, k -> new ArrayList<>()).add(nums.get(i).get(j));
                maxDiagonal = Math.max(maxDiagonal, d);
                total++;
            }
        }

        int[] ans = new int[total];
        int idx = 0;

        for (int d = 0; d <= maxDiagonal; d++) {
            List<Integer> list = map.get(d);
            if (list == null) continue;

            for (int i = list.size() - 1; i >= 0; i--) {
                ans[idx++] = list.get(i);
            }
        }

        return ans;
    }
}
