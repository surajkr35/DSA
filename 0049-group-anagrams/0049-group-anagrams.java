class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        int n = strs.length;

        Map<String, List<String>> map = new HashMap<>();

        for(int i = 0; i < n; i++){
            int[] count = new int[26];

            for(char c : strs[i].toCharArray()){
                count[c - 'a']++;
            }

            String key = Arrays.toString(count);

            map.computeIfAbsent(key, k -> new ArrayList<>()).add(strs[i]);
        }

        return new ArrayList<>(map.values());
    }
}