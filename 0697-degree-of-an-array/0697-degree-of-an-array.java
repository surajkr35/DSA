class Solution {
    public int findShortestSubArray(int[] nums) {
        int n = nums.length;
        int minLen = Integer.MAX_VALUE;
        int freq = 0;

        Map<Integer, Integer> map = new HashMap<>();
        Map<Integer, Integer> first = new HashMap<>();
        Map<Integer, Integer> last = new HashMap<>();

        for(int i = 0; i < n; i++){
            map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);

            if(!first.containsKey(nums[i])){
                first.put(nums[i] , i);
            }

            last.put(nums[i], i);
            
            freq = Math.max(freq, map.get(nums[i]));
        }
        for(int num : map.keySet()){
            if(map.get(num) == freq){
                int len = last.get(num) - first.get(num) + 1;
                minLen = Math.min(minLen, len);
            }
        }
        return minLen;
    }
}