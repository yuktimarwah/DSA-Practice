class Solution {
    public TreeNode build(int prestart,int preend,int instart,int inend,int[] preorder, int[] inorder){
        if(prestart>preend) return null;
        TreeNode root = new TreeNode(preorder[prestart]);
        int inRootIndex = 0;
        for(int i=instart;i<=inend;i++){
            if(inorder[i]==root.val){
                inRootIndex = i;
            }
        }
        int leftsize = inRootIndex-instart;
        root.left = build(prestart+1,prestart+leftsize,instart,inRootIndex-1,preorder,inorder);
        root.right = build(prestart+leftsize+1,preend,inRootIndex+1,inend,preorder,inorder);
        return root;
    }
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        return build(0,preorder.length-1,0,inorder.length-1,preorder,inorder);
    }
}
