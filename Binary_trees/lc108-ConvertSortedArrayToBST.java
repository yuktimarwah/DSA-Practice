class Solution {
    public TreeNode build(int[] nums,int l,int r) {
        if(l>r) return null;
        int mid = l+(r-l)/2;
        TreeNode newnode = new TreeNode(nums[mid]);
        newnode.left = build(nums,l,mid-1);
        newnode.right = build(nums,mid+1,r);
        return newnode;

    }
    public TreeNode sortedArrayToBST(int[] nums) {
        return build(nums,0,nums.length-1);
    }
}
