class Solution {
    public boolean validPath(int n, int[][] edges, int source, int destination) {
        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            adj.add(new ArrayList<>());
        }
        for (int j = 0; j < edges.length; j++) {
                int a = edges[j][0];
                int b = edges[j][1];
               adj.get(a).add(b);
               adj.get(b).add(a);
            }

            boolean[] visited = new boolean[n];
            Queue<Integer> q = new LinkedList<>();
            q.add(source);
            visited[source] = true;
            while (!q.isEmpty()) {
                int currVertex = q.poll();
               for (int ele : adj.get(currVertex)) {
                if (!visited[ele]) {
                    visited[ele] = true;
                    q.add(ele);
                }
               }
            }
            if (!visited[destination]) {
                return false;
            }
            else {
                return true;
            }
    }
}
