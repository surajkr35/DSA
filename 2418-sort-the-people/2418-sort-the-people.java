class Solution {
    public String[] sortPeople(String[] names, int[] heights) {
        // HashMap <Integer, String> map = new HaspMap<>();

        // for(int i = 0; i < height.length; i++){
        //     map.put(height[i], names[i]);
        // }
        TreeMap<Integer, String> map = new TreeMap<>(Collections.reverseOrder());
        List<String> list = new ArrayList<>();

        for (int i = 0; i < heights.length; i++) {
            map.put(heights[i], names[i]);
        }

        for(int key : map.keySet()){
            list.add(map.get(key));
        }
        return list.toArray(new String[list.size()]);
    }
}