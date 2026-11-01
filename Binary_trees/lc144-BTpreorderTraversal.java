class Solution {
    public List<Integer> pre(TreeNode root, List<Integer> ans) {
        if (root == null) {
            return ans; 
        }
        ans.add(root.val);
        pre(root.left, ans);
        pre(root.right, ans);
        return ans;
    }
    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> ans = new ArrayList<>();
        if (root == null) {
            return ans;
        }
        
        pre(root, ans);
        return ans;
        
    }
}
