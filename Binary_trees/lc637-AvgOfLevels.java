class Solution {
    public List<Double> averageOfLevels(TreeNode root) {
        List<Double> ans = new ArrayList<>();

        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);

        while (!q.isEmpty()) {
            int size = q.size();
            Double avg = 0.0;
            Double avgSum = 0.0;
            for (int i = 0; i < size; i++) {
                TreeNode currNode = q.poll();

                avgSum += currNode.val;

                if (currNode.left != null) {
                    q.add(currNode.left);
                }
                if (currNode.right != null) {
                    q.add(currNode.right);
                }
            }
            avg = avgSum / size;
            ans.add(avg);
        }
        return ans;
    }
}
