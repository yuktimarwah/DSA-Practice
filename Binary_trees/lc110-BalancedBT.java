class Solution {
    public int height(TreeNode root){
        if(root==null) return 0;
        if(root.left==null && root.right==null) return 1;
        return 1+Math.max(height(root.left),height(root.right));
    }
    public boolean isBalanced(TreeNode root) {
        if(root==null) return true;
        int leftH=height(root.left);
        int rightH=height(root.right);
        if(((Math.abs(leftH-rightH)<=1)) && isBalanced(root.left) && isBalanced(root.right) )return true;
        else return false;

    }
}
