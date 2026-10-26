class Solution {
    public boolean validPath(int n, int[][] edges, int source, int destination) {
        List<Integer>[] graph = new ArrayList[n];
        boolean[] vis = new boolean[n];

        for(int i = 0; i < n; i++){
            graph[i] = new ArrayList<>();
        }

        for(int[] edge : edges){
            int u = edge[0];
            int v = edge[1];

            graph[u].add(v);
            graph[v].add(u);
        }

        return dfs(graph, source, destination, vis);
    }
    private boolean dfs(List<Integer>[] graph, int s, int d, boolean[] vis){
        if(s == d){
            return true;
        }

        vis[s] = true;

        for(int neigh : graph[s]){
            if(!vis[neigh] && dfs(graph, neigh, d, vis)){
                return true;
            }
        }

        return false;

    }
}