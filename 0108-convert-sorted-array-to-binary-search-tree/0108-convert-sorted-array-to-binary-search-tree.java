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
    public TreeNode sortedArrayToBST(int[] nums) {
        int n=nums.length;
        return convert(nums,0,n-1);
    }
    public TreeNode convert(int[] nums,int Low,int High){
        if(Low>High)return null;
        int mid=(Low+High)/2;
        TreeNode root=new TreeNode(nums[mid]);//mid as root
        root.left=convert(nums,Low,mid-1);//leftSubTree of root
        root.right=convert(nums,mid+1,High);//RightSubTree
        return root;
    }  
}