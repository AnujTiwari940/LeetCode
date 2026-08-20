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
    public TreeNode invertTree(TreeNode root) {
        if(root==null)return null;

        //just Swap left and right node by using temporary node
        TreeNode temp=root.left;
        root.left=root.right;
        root.right=temp;

        //recursively calling both right and left so that their left and right get swapped until null
        invertTree(root.left);
        invertTree(root.right);
        return root;
    }
}