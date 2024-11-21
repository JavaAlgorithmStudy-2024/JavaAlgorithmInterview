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
    public static class info{
        int diam;
        int ht;

        public info(int diam,int ht){
            this.diam=diam;
            this.ht=ht;
        }
    }

    public int diameterOfBinaryTree(TreeNode root) {
        return helper(root).diam;
    }

    public static info helper(TreeNode root){
        if(root==null){
            return new info(0,0);
        }
        
        info leftInfo = helper(root.left);
        info rightInfo = helper(root.right);

        int height=Math.max(leftInfo.ht,rightInfo.ht)+1;
        int diameter= Math.max(Math.max(leftInfo.diam,rightInfo.diam) ,leftInfo.ht+rightInfo.ht);


        return new info (diameter,height);
    }
}