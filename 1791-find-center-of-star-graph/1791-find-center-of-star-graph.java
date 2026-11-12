class Solution {
    public int findCenter(int[][] edges) {
        int m = edges.length;
        Set<Integer> set = new HashSet<>();

        for(int i = 0; i < m; i++){
            int u = edges[i][0];
            int v = edges[i][1];

            if(set.contains(u)){
                return u;
            }
            else if(set.contains(v)){
                return v;
            }
            set.add(u);
            set.add(v);
        }
        return 0;
    }
}