class Solution {
    int min = Integer.MAX_VALUE;
    int prev = -1;

    public int getMinimumDifference(TreeNode root) {
        helper(root);
        return min;
    }

    private void helper(TreeNode root){
        if(root == null) return;

        helper(root.left);

        if(prev != -1){
            min = Math.min(min, root.val - prev);
        }
        
        prev = root.val;

        helper(root.right);
    }
}