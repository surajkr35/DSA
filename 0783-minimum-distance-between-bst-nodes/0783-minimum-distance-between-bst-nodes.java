class Solution {
    int min = Integer.MAX_VALUE;
    Integer prev = null;

    public int minDiffInBST(TreeNode root) {
        helper(root);
        return min;
    }

    private void helper(TreeNode root){
        if(root == null) return;

        helper(root.left);

        if(prev != null){
            min = Math.min(min, Math.abs(prev - root.val));
        }
        
        prev = root.val;

        helper(root.right);
    }
}