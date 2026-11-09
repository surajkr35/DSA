class Solution {
    public boolean canVisitAllRooms(List<List<Integer>> rooms) {
        int n = rooms.size();
        boolean[] vis = new boolean[n];
        Queue<Integer> q = new LinkedList<>();

        q.add(0);

        while(!q.isEmpty()){
            int curr = q.remove();
            vis[curr] = true;

            for(int i = 0; i < rooms.get(curr).size(); i++){
                if(!vis[rooms.get(curr).get(i)]){
                    q.add(rooms.get(curr).get(i));
                }
            }
        }

        for(int i = 0; i < n; i++){
            if(!vis[i]){
                return false;
            }
        }

        return true;
    }
}