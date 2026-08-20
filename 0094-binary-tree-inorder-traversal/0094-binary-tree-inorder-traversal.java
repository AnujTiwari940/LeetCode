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
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> ans = new ArrayList<>();//created a list ans
        inorder(root, ans);//calling method inorder which has two parameter root and ans
        return ans;
    }

    public void inorder(TreeNode root, List<Integer> ans) {//new method
        if (root == null) return;
        inorder(root.left, ans);//recursion
        ans.add(root.val);//storing in ans
        inorder(root.right, ans);//recursion
    }
}