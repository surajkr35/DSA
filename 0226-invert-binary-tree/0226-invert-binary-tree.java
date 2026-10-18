class Solution {
    public TreeNode invertTree(TreeNode root) {
        if (root == null) return null;

        TreeNode temp = root.left;
        root.left = root.right;
        root.right = temp;

        invertTree(root.left);
        invertTree(root.right);

        return root;
    }
}

// class Solution {
//     public TreeNode invertTree(TreeNode root) {
//         if(root == null){
//             return null;
//         }

//         TreeNode leftMirror = invertTree(root.left);
//         TreeNode rightMirror = invertTree(root.right);

//         root.left = rightMirror;
//         root.right = leftMirror;

//         return root;
//     }
// }