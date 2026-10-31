class Solution {
    public int minDepth(TreeNode root) {
        if(root==null) return 0;
        int left = minDepth(root.left);
        int right = minDepth(root.right);
        if(root.left!=null&&root.right==null) return 1+left; 
        if(root.left==null&&root.right!=null) return 1+right; 
        return 1+Math.min(left,right);
    }
}
