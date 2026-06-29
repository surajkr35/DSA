/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
public class Codec {

    public String serialize(TreeNode root) {
        StringBuilder sb = new StringBuilder();
        preorder(root, sb);
        return sb.toString();
    }

    private void preorder(TreeNode node, StringBuilder sb) {
        if(node == null){
            sb.append("null,");
            return;
        }

        sb.append(node.val).append(",");
        preorder(node.left, sb);
        preorder(node.right, sb);
    }

    int index = 0;

    public TreeNode deserialize(String data){
        String[] values = data.split(",");
        return build(values);
    }

    private TreeNode build(String[] values){

        if(values[index].equals("null")){
            index++;
            return null;
        }

        TreeNode root = new TreeNode(Integer.parseInt(values[index++]));

        root.left = build(values);
        root.right = build(values);

        return root;
    }
}