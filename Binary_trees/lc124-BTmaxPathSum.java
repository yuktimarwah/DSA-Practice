class Solution {
    int max = Integer.MIN_VALUE;
    public int dfs(TreeNode root){
         if(root==null) return 0;
        
        int left = dfs(root.left);
        left = Math.max(0,left);
        int right = dfs(root.right);
        right = Math.max(0,right);
        max = Math.max(max,root.val + left + right);
        return root.val+Math.max(left,right);
    }
    public int maxPathSum(TreeNode root) {
       dfs(root);
       return max;

    }
}
