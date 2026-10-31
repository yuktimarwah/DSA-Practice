class Solution {
    public boolean has(TreeNode root,int targetSum){
        if(root==null) return false;
       
        if(root.left==null&&root.right==null) return targetSum== root.val;
        
        // currsum+=root.val;

        // boolean left = has(root.left,targetSum,currsum);
        boolean left = has(root.left,targetSum - root.val);
        boolean right = has(root.right,targetSum - root.val);


        // currsum-= root.val;
        // System.out.println(currsum);
        return left || right;
       
    }
    public boolean hasPathSum(TreeNode root, int targetSum) {
        return has(root,targetSum);

    }
}

