class Solution {
    public TreeNode createBinaryTree(int[][] descriptions) {
        Map<Integer, TreeNode> nodes = new HashMap<>();
        Set<Integer> set = new HashSet<>();

        for(int[] des : descriptions){
            int parent = des[0];
            int child = des[1];
            int isLeft = des[2];

            nodes.putIfAbsent(parent, new TreeNode(parent));
            nodes.putIfAbsent(child, new TreeNode(child));

            TreeNode p = nodes.get(parent);
            TreeNode c = nodes.get(child);

            set.add(child);

            if(isLeft == 1){
                p.left = c;
            }
            else {
                p.right = c;
            }
        }
        for(int root : nodes.keySet()){
            if(!set.contains(root)){
                return nodes.get(root);
            }
        }
        return null;
    }
}