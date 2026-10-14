class Solution {
    public int kthSmallest(TreeNode root, int k) {
        int[] count = {0};
        return helper(root, k, count);
    }

    private int helper(TreeNode root, int k, int[] count) {
        if(root == null) {
            return -1;
        }

        int left = helper(root.left, k, count);
        if(left != -1){
            return left;
        }

        count[0]++;

        if(count[0] == k){
            return root.val;
        }

        return helper(root.right, k, count);
    }
}