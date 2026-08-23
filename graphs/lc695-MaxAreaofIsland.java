class Solution {
    
    class Pair {
        int r;
        int c;

        Pair (int r,int c) {
            this.r = r;
            this.c = c;
        }
    }

    public int maxAreaOfIsland(int[][] grid) {
        int maxArea = 0;

        for (int i = 0; i< grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                int area = 0;
                if (grid[i][j] == 1) {
                    area = 1;
                    Queue<Pair> q = new LinkedList<>();
                    grid[i][j] = 0;
                    q.add(new Pair(i,j));
                    while (!q.isEmpty()) {
                        Pair curr = q.poll();
                        int row = curr.r;
                        int col = curr.c;
                        

                        int urow = row-1;
                        int ucol = col;
                        if(0 <= urow && urow < grid.length && 0 <= ucol && ucol < grid[0].length) {
                            if (grid[urow][ucol] == 1) {
                                area++;
                                grid[urow][ucol] = 0;
                                q.add(new Pair(urow,ucol));
                            }
                        }

                        int drow = row+1;
                        int dcol = col;
                        if(0 <= drow && drow < grid.length && 0 <= dcol && dcol < grid[0].length) {
                            if (grid[drow][dcol] == 1) {
                                area++;
                                grid[drow][dcol] = 0;
                                q.add(new Pair(drow,dcol));
                            }
                        }

                        int lrow = row;
                        int lcol = col-1;
                        if(0 <= lrow && lrow < grid.length && 0 <= lcol && lcol < grid[0].length) {
                            if (grid[lrow][lcol] == 1) {
                                area++;
                                grid[lrow][lcol] = 0;
                                q.add(new Pair(lrow,lcol));
                            }
                        }

                        int rrow = row;
                        int rcol = col+1;
                        if(0 <= rrow && rrow < grid.length && 0 <= rcol && rcol < grid[0].length) {
                            if (grid[rrow][rcol] == 1) {
                                area++;
                                grid[rrow][rcol] = 0;
                                q.add(new Pair(rrow,rcol));
                            }
                        }
                    }
                }
                
                maxArea = Math.max(maxArea,area);
            }
        }
        return maxArea;
    }
}
