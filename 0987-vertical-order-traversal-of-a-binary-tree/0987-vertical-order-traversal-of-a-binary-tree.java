
class Solution {

    class Info {
        int d, row;
        TreeNode root;

        public Info(int d, int row, TreeNode root) {
            this.d = d;
            this.row = row;
            this.root = root;
        }
    }

    public List<List<Integer>> verticalTraversal(TreeNode root) {
        Queue<Info> q = new LinkedList<>();
        List<List<Integer>> ans = new ArrayList<>();

        Map<Integer, Map<Integer, PriorityQueue<Integer>>> map =
            new TreeMap<>();

        if(root == null){
            return ans;
        }

        q.add(new Info(0, 0, root));

        while(!q.isEmpty()){
            Info temp = q.poll();

            map.putIfAbsent(temp.d, new TreeMap<>());
            map.get(temp.d).putIfAbsent(temp.row, new PriorityQueue<>());

            map.get(temp.d).get(temp.row).add(temp.root.val);

            if(temp.root.left != null){
                q.add(new Info(temp.d - 1, temp.row + 1, temp.root.left));
            }

            if(temp.root.right != null){
                q.add(new Info(temp.d + 1, temp.row + 1, temp.root.right));
            }
        }

        for(int col : map.keySet()){
            List<Integer> column = new ArrayList<>();

            for(int row : map.get(col).keySet()){
                PriorityQueue<Integer> pq = map.get(col).get(row);

                while(!pq.isEmpty()){
                    column.add(pq.poll());
                }
            }

            ans.add(column);
        }

        return ans;
    }
}
