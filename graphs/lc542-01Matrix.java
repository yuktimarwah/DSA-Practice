class Solution {

    class Pair {
        int r;
        int c;

        Pair(int r, int c) {
            this.r = r;
            this.c = c;
        }
    }

    public int[][] updateMatrix(int[][] mat) {
        int[][] dis = new int[mat.length][mat[0].length];

        for (int i = 0; i < dis.length; i++) {
            for (int j = 0; j < dis[0].length; j++) {
                dis[i][j] = -1;
            }
        }

        Queue<Pair> q = new LinkedList<>();

        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[0].length; j++) {
                if (mat[i][j] == 0) {
                    dis[i][j] = 0;
                    q.add(new Pair(i,j));
                }
            }
        }

        while (!q.isEmpty()) {
                    Pair curr = q.poll();
                    int row = curr.r;
                    int col = curr.c;
                    
                    int urow = row-1;
                    int ucol = col;
                    if (0 <= urow && urow < mat.length && 0 <= ucol && ucol < mat[0].length) {
                        if (dis[urow][ucol] == -1) {
                            dis[urow][ucol] = dis[row][col] + 1;
                            q.add(new Pair(urow,ucol));
                        }
                    }

                    int drow = row+1;
                    int dcol = col;
                    if (0 <= drow && drow < mat.length && 0 <= dcol && dcol < mat[0].length) {
                        if (dis[drow][dcol] == -1) {
                            dis[drow][dcol] = dis[row][col] + 1;
                            q.add(new Pair(drow,dcol));
                        }
                    }

                    int lrow = row;
                    int lcol = col-1;
                    if (0 <= lrow && lrow < mat.length && 0 <= lcol && lcol < mat[0].length) {
                        if (dis[lrow][lcol] == -1) {
                            dis[lrow][lcol] = dis[row][col] + 1;
                            q.add(new Pair(lrow,lcol));
                        }
                    }

                    int rrow = row;
                    int rcol = col+1;
                    if (0 <= rrow && rrow < mat.length && 0 <= rcol && rcol < mat[0].length) {
                        if (dis[rrow][rcol] == -1) {
                            dis[rrow][rcol] = dis[row][col] + 1;
                            q.add(new Pair(rrow,rcol));
                        }
                    }
                }
                return dis;
    }
}
