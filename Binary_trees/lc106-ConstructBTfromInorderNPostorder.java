class Solution {
    public TreeNode build(int instart,int inend,int poststart,int postend,int[] inorder, int[] postorder){
        if(instart>inend) return null;
        TreeNode root = new TreeNode(postorder[postend]);
        int inRootIndex=0;
        for(int i=instart;i<=inend;i++){
            if(inorder[i]==root.val){
                inRootIndex=i;
            }
        }
        int leftsize = inRootIndex-instart;
        root.left = build(instart,inRootIndex-1,poststart,poststart+leftsize-1,inorder,postorder);
        root.right = build(inRootIndex+1,inend,poststart+leftsize,postend-1,inorder,postorder);
        return root;
        
    }
    public TreeNode buildTree(int[] inorder, int[] postorder) {
        return build(0,inorder.length-1,0,postorder.length-1,inorder,postorder);
    }
}
