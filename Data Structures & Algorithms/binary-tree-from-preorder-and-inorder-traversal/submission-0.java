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

class Solution {
    int preIndex=0;
    Map<Integer,Integer>mp=new HashMap<>();
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        for(int i=0;i<inorder.length;i++){
            mp.put(inorder[i],i);
        }
        return build(preorder,0,inorder.length-1);
    }
    public TreeNode build(int pre[],int left,int right){
        if(left>right){
            return null;
        }
        int rootValue=pre[preIndex++];
        TreeNode root=new TreeNode(rootValue);

        int mid=mp.get(rootValue);
        root.left=build(pre,left,mid-1);
        root.right=build(pre,mid+1,right);
        return root;
    }
}
