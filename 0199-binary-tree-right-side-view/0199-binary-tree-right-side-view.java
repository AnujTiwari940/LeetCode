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
    ArrayList<Integer> ans = new ArrayList<>();
    public List<Integer> rightSideView(TreeNode root) {
        view(root, 0);
        return ans;
    }
    void view(TreeNode root, int level) {
        if (root == null) return;
        if (level == ans.size())
            ans.add(root.val);
        view(root.right, level + 1);
        view(root.left, level + 1);
    }
}