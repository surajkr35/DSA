class Solution {
    public boolean uniqueOccurrences(int[] arr) {
        int n = arr.length;
        Map<Integer, Integer> map = new HashMap<>();

        for(int i = 0; i < n; i++){
            map.put(arr[i], map.getOrDefault(arr[i], 0) + 1);
        }

        Set<Integer> set = new HashSet<>();
        for(int count : map.values()){
            if(set.contains(count)) return false;
            else set.add(count);
        }
        return true;
    }
}