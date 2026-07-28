class Solution {
    public boolean canVisitAllRooms(List<List<Integer>> adj) {
        int n = adj.size();
        boolean[] visited = new boolean[n];
        visited[0] =  true;
        bfs(0,adj,visited);
        for(boolean ele:visited){
            if(ele==false) return false;
        }
        return true;
    }

    public void bfs(int start, List<List<Integer>> adj, boolean[] visited){
        Queue<Integer> q = new LinkedList<>();
        q.add(start);
        while(!q.isEmpty()){
            int front = q.poll();
            for(int x:adj.get(front)){
                if(!visited[x]){
                    q.add(x);
                    visited[x] = true;
                }
            }
        }
    }
}
