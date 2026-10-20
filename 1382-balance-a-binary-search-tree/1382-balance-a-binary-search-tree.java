class Solution {
    public TreeNode balanceBST(TreeNode root) {
        List<Integer> list = new ArrayList<>();
        inorder(root, list);

        return createBST(list, 0 , list.size() - 1);
    }
    private void inorder(TreeNode root, List<Integer> list){
        if(root == null){
            return;
        }

        inorder(root.left, list);
        list.add(root.val);
        inorder(root.right, list);
    }
    private TreeNode createBST(List<Integer> list, int st, int end){
        if(st > end){
            return null;
        }

        int mid = st + (end - st) / 2;
        TreeNode root = new TreeNode(list.get(mid));
        root.left = createBST(list, st, mid - 1);
        root.right = createBST(list, mid + 1, end);

        return root;
    }
}