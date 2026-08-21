class Solution {
    int count = 0;
    int maxCount = 0;
    Integer prev = null;
    public int[] findMode(TreeNode root) {
        List<Integer> ans = new ArrayList<>();
        helper(root, ans);
        
        int[] mode = new int[ans.size()];
        for(int i = 0; i < ans.size(); i++){
            mode[i] = ans.get(i);
        }

        return mode;
    }
    private void helper(TreeNode root, List<Integer> ans){
        if(root == null) return;

        helper(root.left, ans);

        if(prev != null && root.val == prev){
            count++;
        }
        else {
            count = 1;
        }
        if(count >= maxCount){
            if(count == maxCount){
                ans.add(root.val);
            }
            else {
                ans.clear();
                ans.add(root.val);
                maxCount = count;
            }
        }
        
        prev = root.val;

        helper(root.right, ans);

    }
}