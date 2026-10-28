class Solution {
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        
        List<List<Integer>> res = new ArrayList<>();

        if (root == null) {
            return res;
        }

        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);

        int l = 1; 
        
        while (!q.isEmpty()) {
            int size = q.size();

            List<Integer> level = new ArrayList<>();
            

            for (int i = 0; i < size; i++) {
                TreeNode currNode = q.poll();
                if (l % 2 != 0) {
                    level.add(currNode.val);
                }
                else {
                    level.add(0,currNode.val);
                }

                if (currNode.left != null) {
                    q.add(currNode.left);
                }

                if (currNode.right != null) {
                    q.add(currNode.right);
                }
            }
            l++;
            res.add(level);
        }
        return res;
    }
}
