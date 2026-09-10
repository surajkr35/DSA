class Solution {
    int count = 0;

    public int averageOfSubtree(TreeNode root) {
        helper(root);
        return count;
    }

    private int[] helper(TreeNode root){
        if(root == null){
            return new int[] {0, 0};
        }
        int sum = 0;
        int nodeCount = 0;
        int[] left = helper(root.left);
        int[] right = helper(root.right);
        sum = left[0] + right[0] + root.val;
        nodeCount += left[1] + right[1] + 1;
        int avg = sum / nodeCount;

        if(avg == root.val){
            count++;
        }
        return new int[]{sum, nodeCount};

    }
}

/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */