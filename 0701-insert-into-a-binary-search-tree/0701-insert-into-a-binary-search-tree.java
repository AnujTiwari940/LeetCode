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
    public TreeNode insertIntoBST(TreeNode root, int val) {
        TreeNode t=new TreeNode(val);//made new node with val 
        if(root==null)return t;//if null tree return t node

        //Can attach t to any node where bst valid but for ease will attach t only to leaf node
        if(root.left==null && root.right==null){//leaf node 
         if(root.val<val)root.right=t;
         else if(root.val>val)root.left=t;
        }

        if(root.val<val)root.right=insertIntoBST(root.right,val);
        else if(root.val>val)root.left=insertIntoBST(root.left,val);
         return root;
    }
}