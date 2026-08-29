class Solution {
    public TreeNode buildTree(int[] inorder, int[] postorder) {
        int n = inorder.length;
        return build(0, n - 1, 0, n - 1, inorder, postorder);
    }
    public TreeNode build(int inLo, int inHi, int postLo, int postHi, int[] inorder, int[] postorder) {
        // Base case
        if (postLo > postHi)return null;
        
        // Last element of postorder is the root
        int val = postorder[postHi];
        TreeNode root = new TreeNode(val);

        // Find root in inorder
        int r = 0;
        for (int i = inLo; i <= inHi; i++) {
            if (inorder[i] == val) {
                r = i;
                break;
            }
        }

        // Number of nodes in left subtree
        int cnt = r - inLo;

        // Build left subtree
        root.left = build(inLo,r - 1,postLo,postLo+cnt-1,inorder,  postorder);

        // Build right subtree
        root.right = build(r + 1,inHi,postLo+cnt,postHi-1,inorder,postorder);
        return root;
    }
}
