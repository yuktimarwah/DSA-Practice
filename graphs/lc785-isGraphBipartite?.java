class Solution {
    public boolean dfs(int node, int[][] graph, int[] color, int col) {
        color[node] = col;

        for (int neighbour : graph[node]) {
            if (color[neighbour] == -1) {
                if(!dfs(neighbour, graph, color, 1 - col)) {
                    return false;
                }
            }
            else {
                if (color[neighbour] == color[node]) {
                return false;
                }
            }
        }
        return true;
    }

    public boolean isBipartite(int[][] graph) {
        
        int[] color = new int[graph.length];
        Arrays.fill(color,-1);     //-1 -> uncolored

        for (int i = 0; i < graph.length; i++ ) {
            if (color[i] == -1) {
                if(!dfs(i, graph, color, 0)) {
                    return false;
                }
            }
        }
        return true;
        
    }
}
