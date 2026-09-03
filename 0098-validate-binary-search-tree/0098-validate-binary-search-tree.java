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
    public boolean isValidBST(TreeNode root) {
        ArrayList<Integer>arr=new ArrayList<>();
        inorder(root,arr);

        for(int i=0;i<arr.size()-1;i++){
        //suppose 5 element so size=5,and indexes 0 to 4....i<arr.size()-1=>i<4 means i till 3 and i+1=4
        //and if we did i till 4 means i<arr.size() then i+1=5 and there is no 5th index ..so error so keep i till 3
            if(arr.get(i)>=arr.get(i+1))return false;//if prev>next then false
        }
        return true;
    }
    public void inorder(TreeNode root,ArrayList<Integer>arr){
        if(root==null)return;
        inorder(root.left,arr);
        arr.add(root.val);
        inorder(root.right,arr);
    }
}