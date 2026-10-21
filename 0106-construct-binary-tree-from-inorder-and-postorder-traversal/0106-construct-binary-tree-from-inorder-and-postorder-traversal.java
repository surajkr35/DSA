class Solution {
    int postIdx;
    public TreeNode buildTree(int[] inorder, int[] postorder) {
        Map<Integer, Integer> map = new HashMap<>();
        postIdx = postorder.length - 1;

        for(int i = 0; i < inorder.length; i++){
            map.put(inorder[i], i);
        }
        return build(inorder, 0, inorder.length - 1, postorder, map);
    }

    private TreeNode build(int[] inorder, int st, int end, int[] postorder, Map<Integer, Integer> map){
        if(st > end){
            return null;
        }
        int val = postorder[postIdx--];
        TreeNode root = new TreeNode(val);

        int mid = map.get(val);

        root.right = build(inorder, mid + 1, end, postorder, map);
        root.left = build(inorder, st, mid - 1, postorder, map);

        return root;
    }
}