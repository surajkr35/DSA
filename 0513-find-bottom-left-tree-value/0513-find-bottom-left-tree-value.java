class Solution {
    public int findBottomLeftValue(TreeNode root) {
        Queue<TreeNode> q = new LinkedList<>();
        List<Integer> ans = new ArrayList<>();

        q.add(root);

        while(!q.isEmpty()){
            int size = q.size();
            ans.clear();

            for(int i = 0; i < size; i++){
                TreeNode temp = q.remove();
                ans.add(temp.val);

                if(temp.left != null){
                    q.add(temp.left);
                }
                if(temp.right != null){
                    q.add(temp.right);
                }
            }
        }
        return ans.get(0);
    }
}