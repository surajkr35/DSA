class Solution {
    public List<List<Integer>> levelOrderBottom(TreeNode root) {
        List<Integer> list = new ArrayList<>();
        List<List<Integer>> ans = new ArrayList<>();
        Queue<TreeNode> q = new LinkedList<>();

        if(root == null) return ans;

        q.add(root);
        q.add(null);

        while(!q.isEmpty()){
            TreeNode temp = q.remove();
            if(temp == null){
                ans.add(new ArrayList<>(list));
                list.clear();

                if(!q.isEmpty()){
                    q.add(null);
                }
            }
            else {
                list.add(temp.val);
                
                if(temp.left != null){
                    q.add(temp.left);
                }
                if(temp.right != null){
                    q.add(temp.right);
                }
            }
        }
        Collections.reverse(ans);
        return ans;
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