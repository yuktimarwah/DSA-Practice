class Solution {
    public boolean is(TreeNode root, long max, long min) {
        if (root == null) return true;
        if (min >= root.val || max <= root.val) return false;
        if (is (root.left, root.val, min) && is (root.right, max, root.val)) {
            return true;
        }
        return false;
    }
    public boolean isValidBST(TreeNode root) {
        return is(root, Long.MAX_VALUE, Long.MIN_VALUE);   
    }
}
