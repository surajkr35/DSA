class Solution {
    public int countSpecialIntegers(int[] nums) {
        int n = nums.length;
        Map<Integer, List<Integer>> map = new HashMap<>();

        for(int i = 0; i < n; i++){
            map.computeIfAbsent(nums[i], x -> new ArrayList<>()).add(i);
        }

        int cnt = 0;

        for(List<Integer> temp : map.values()){
            if(temp.size() < 3){
                continue;
            }
            int diff = temp.get(1) - temp.get(0);
            boolean poss = true;
            
            for(int i = 2; i < temp.size(); i++){
                if(temp.get(i) - temp.get(i-1) != diff){
                    poss = false;
                    break;
                }
                
            }
            if(poss){
                cnt++;
            }
        }

        return cnt;
    }
}