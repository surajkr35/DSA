class Solution {
    public boolean validPath(int n, int[][] edges, int source, int destination) {
        if(source == destination){
            return true;
        }

        boolean[] vis = new boolean[n];
        List<Integer>[] graph = new ArrayList[n];
        Queue<Integer> q = new LinkedList<>();

        for(int i = 0; i < n; i++){
            graph[i] = new ArrayList<>();
        }

        for(int[] edge : edges){
            int u = edge[0];
            int v = edge[1];

            graph[u].add(v);
            graph[v].add(u);
        }

        q.add(source);
        vis[source] = true;

        while(!q.isEmpty()){
            int curr = q.remove();

            for(int i = 0; i < graph[curr].size(); i++){
                int key = graph[curr].get(i);

                if(!vis[key]){
                    vis[key] = true;
                    q.add(key);
                }
            }
        }

        return vis[destination];
    }
}