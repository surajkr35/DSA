class Solution {
    public int[] findDiagonalOrder(List<List<Integer>> nums) {

        Map<Integer, List<Integer>> map = new HashMap<>();

        int total = 0;
        int maxDiagonal = 0;

        for (int i = 0; i < nums.size(); i++) {
            for (int j = 0; j < nums.get(i).size(); j++) {

                int diagonal = i + j;

                if (!map.containsKey(diagonal)) {
                    map.put(diagonal, new ArrayList<>());
                }

                map.get(diagonal).add(nums.get(i).get(j));

                total++;
                maxDiagonal = Math.max(maxDiagonal, diagonal);
            }
        }

        int[] ans = new int[total];
        int index = 0;

        for (int d = 0; d <= maxDiagonal; d++) {

            if (!map.containsKey(d))
                continue;

            List<Integer> list = map.get(d);

            for (int i = list.size() - 1; i >= 0; i--) {
                ans[index++] = list.get(i);
            }
        }

        return ans;
    }
}
