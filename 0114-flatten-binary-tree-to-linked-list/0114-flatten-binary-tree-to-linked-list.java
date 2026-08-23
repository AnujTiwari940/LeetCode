class Solution {
    public void flatten(TreeNode root) {
        ArrayList<TreeNode>list=new ArrayList<>();//new empty list created
        preorder(root,list);//add elements in list by preorder
        for(int i=0;i<list.size()-1;i++){
            TreeNode curr=list.get(i);// initially curr=list.get(0)
            curr.left=null;
            curr.right=list.get(i+1);//curr.right =list(1) & so on
        }
    }
    public void preorder(TreeNode root,ArrayList<TreeNode>list){
        if(root==null)return;
        list.add(root);//for preorder add root first in list 
        preorder(root.left,list);//then left
        preorder(root.right,list);//then right
    }
}