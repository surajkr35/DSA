// class Solution {
//     public TreeNode bstFromPreorder(int[] preorder) {
//         return createBST(preorder, 0, preorder.length - 1);
//     }

//     private TreeNode createBST(int[] pre, int st, int end){
//         if(st > end){
//             return null;
//         }

//         TreeNode root = new TreeNode(pre[st]);

//         int i = st + 1;

//         while(i <= end && pre[i] < root.val){
//             i++;
//         }

//         root.left = createBST(pre, st + 1, i - 1);
//         root.right = createBST(pre, i, end);

//         return root;
//     }
// }

class Solution {
    int i = 0;

    public TreeNode bstFromPreorder(int[] preorder) {
        return build(preorder, Integer.MAX_VALUE);
    }

    private TreeNode build(int[] pre, int bound) {
        if(i == pre.length || pre[i] > bound){
            return null;
        }

        TreeNode root = new TreeNode(pre[i++]);

        root.left = build(pre, root.val);
        root.right = build(pre, bound);

        return root;
    }
}