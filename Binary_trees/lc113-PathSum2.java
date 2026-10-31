class Solution {
    public void dfs(TreeNode root,int targetSum,List<Integer> path,List<List<Integer>> res){
        
        if(root==null) return;
        path.add(root.val);
        targetSum-=root.val;
        if(root.left==null&&root.right==null&&targetSum==0){
            res.add(new ArrayList<>(path));
        }
        dfs(root.left,targetSum,path,res);
        dfs(root.right,targetSum,path,res);
        path.remove(path.size()-1);

    }
    public List<List<Integer>> pathSum(TreeNode root, int targetSum) {
        List<List<Integer>> res = new ArrayList<>();
        List<Integer> path = new ArrayList<>();
        dfs(root,targetSum,path,res);
        return res;
    }
}
