class Solution {
    public void dfs(int[][] isConnected, int i, boolean[] visited) {
        visited[i] = true;
        for (int j = 0; j < isConnected.length; j++) {
            if (isConnected[i][j] == 1 && visited[j] == false) {
                dfs(isConnected,j, visited);
            }
        }
    }

    public int findCircleNum(int[][] isConnected) {
        int n = isConnected.length;
        int province = 0;
        boolean[] visited = new boolean[n];
        for (int i = 0; i < n; i++) {
            if (!visited[i]) {
            dfs(isConnected,i,visited);
             province++;
            }
        }
        return province;
    }
}
