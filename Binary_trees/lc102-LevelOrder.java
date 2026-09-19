class Solution {
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> res = new ArrayList<>();

        if (root == null) {
            return res;
        }

        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);

        while (!q.isEmpty()) {
            int size = q.size();
            
            List<Integer> level = new ArrayList<>();
            for (int i = 0; i < size; i++) {
                TreeNode currNode = q.poll();
                level.add(currNode.val);

                if (currNode.left != null) {
                    q.add(currNode.left);
                }
                if (currNode.right != null) {
                    q.add(currNode.right);
                }
            }
            res.add(level);  
        }
        return res;
    }
}
