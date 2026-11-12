class Solution {
    public int maxStarSum(int[] vals, int[][] edges, int k) {
        int n = vals.length;
        int maxSum = Integer.MIN_VALUE;

        List<Integer>[] graph = new ArrayList[n];

        for(int i = 0; i < n; i++){
            graph[i] = new ArrayList<>();
        }

        for(int[] e : edges){
            int u = e[0];
            int v = e[1];

            graph[u].add(v);
            graph[v].add(u);
        }

        for(int i = 0; i < n; i++){
            PriorityQueue<Integer> pq = new PriorityQueue<>();
            int sum = vals[i];

            for(int nb : graph[i]){
                int v = vals[nb];
                if(v <= 0 || k == 0){
                    continue;
                }

                pq.add(v);
                sum += v;

                if(pq.size() > k){
                    sum -= pq.remove();
                }
            }

            maxSum = Math.max(maxSum, sum);
        }

        return maxSum;
    }
}