class Solution {
    public List<List<Integer>> levelOrder(TreeNode root) {
       List<List<Integer>> ans = new ArrayList<>();//new 2d list
        if (root == null)
            return ans;

        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);
        while(q.size()>0) {
            int size = q.size();
            List<Integer> level = new ArrayList<>();
            for (int i = 0; i < size; i++) {
               TreeNode curr = q.remove();
                level.add(curr.val);
                if (curr.left != null)q.add(curr.left);
                if (curr.right != null)q.add(curr.right);
            }
            ans.add(level);
        }
        return ans;
    }
}