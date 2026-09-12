class Solution {
    public int countSpecialIntegers(int[] nums) {
        int n = nums.length;
        Map<Integer, List<Integer>> map = new HashMap<>();

        for(int i = 0; i < n; i++){
            map.computeIfAbsent(nums[i], x -> new ArrayList<>()).add(i);
        }

        int cnt = 0;

        for(List<Integer> temp : map.values()){
            if(temp.size() == 3){
                if(temp.get(1) - temp.get(0) == temp.get(2) - temp.get(1)){
                    cnt++;
                }
            }
        }

        return cnt;
    }
}