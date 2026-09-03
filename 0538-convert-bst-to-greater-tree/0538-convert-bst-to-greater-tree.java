class Solution {
    public TreeNode convertBST(TreeNode root) {
        ArrayList<TreeNode> arr = new ArrayList<>();
        inorder(root, arr);
        Collections.reverse(arr);
        int sum = 0;//initially sum=0
        for (int i = 0; i < arr.size(); i++) {
            int val = arr.get(i).val;// take OLD value of that node
            sum =sum+ val; // add it to total & sum also changed from 0
            arr.get(i).val = sum; // replace node's value to new value sum
        }
        return root;
    }
    public void inorder(TreeNode root, ArrayList<TreeNode> arr) {
        if (root == null) return;
        inorder(root.left, arr);
        arr.add(root);
        inorder(root.right, arr);
    }
}