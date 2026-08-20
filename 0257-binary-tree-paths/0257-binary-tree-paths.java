class Solution {
    public List<String> binaryTreePaths(TreeNode root) {
        List<String> ans = new ArrayList<>();
        helper(root, ans, new StringBuilder());

        return ans;
    }
    private void helper(TreeNode root, List<String> ans, StringBuilder path){
        if(root == null) return;

        int len = path.length();
        if(len != 0){
            path.append("->");
        }

        path.append(root.val);

        if(root.left == null && root.right == null){
            ans.add(path.toString());
        }

        helper(root.left, ans, path);
        helper(root.right, ans, path);

        path.setLength(len);
    }
}