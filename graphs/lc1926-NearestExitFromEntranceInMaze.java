class Solution {

    class Pair {
        int r;
        int c;

        Pair(int r, int c) {
            this.r = r;
            this.c = c;
        }
    }

    public int nearestExit(char[][] maze, int[] entrance) {
        int n = maze.length;
        int m = maze[0].length;

        int[][] dis = new int[n][m];

        for (int i = 0; i < n; i++ ) {
            for (int j = 0; j < m; j++) {
                dis[i][j] = -1;        
            }
        }

        Queue<Pair> q = new LinkedList<>();
        q.add(new Pair(entrance[0],entrance[1]));
        dis[entrance[0]][entrance[1]] = 0;

        int[] dr = {-1,1,0,0};
        int[] dc = {0,0,-1,1};

        while( !q.isEmpty()) {
            Pair curr = q.poll();
            int row = curr.r;
            int col = curr.c;

            for (int i = 0; i < 4; i++) {
                int newrow = row + dr[i];
                int newcol = col + dc[i];

                if(0 <= newrow && newrow < n && 0 <= newcol && newcol < m) {

                    if (maze[newrow][newcol] == '.' && dis[newrow][newcol] == -1) {
                        
                        if (newrow == 0 || newcol == 0 || newrow == n-1 || newcol == m-1) {
                            return dis[row][col] + 1;
                        }
                            else {
                                dis[newrow][newcol] = dis[row][col] + 1;
                                q.add(new Pair(newrow,newcol));
                            }
                    }
                }
            }
        }
        return -1;
    }
}
