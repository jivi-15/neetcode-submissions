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

public class Codec {

    // Encodes a tree to a single string.
    public String serialize(TreeNode root) {
        StringBuilder sb=new StringBuilder();
        serial(root,sb);
        return sb.toString();
    }
    public void serial(TreeNode root, StringBuilder sb){
        if(root==null){
            sb.append("N,");
            return;
        }
        sb.append(root.val).append(",");
        serial(root.left,sb);
        serial(root.right,sb);

    }

    // Decodes your encoded data to tree.
    public TreeNode deserialize(String data) {
        String[] values=data.split(",");
        Queue<String>q=new LinkedList<>(Arrays.asList(values));
        return deserial(q);
    }
    public TreeNode deserial(Queue<String>q){
        String value=q.poll();
        if(value.equals("N")){
            return null;
        }
        TreeNode node=new TreeNode(Integer.parseInt(value));
        node.left=deserial(q);
        node.right=deserial(q);
        return node;
    }
}
