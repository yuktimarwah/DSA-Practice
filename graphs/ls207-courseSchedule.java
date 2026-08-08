class Solution {
    public boolean canFinish(int numCourses, int[][] prerequisites) {
       
        //step-1 : making adj list n indegree array

        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
        int[] indegree = new int[numCourses];

        for (int i = 0; i < numCourses; i++) {
            adj.add( new ArrayList<>());
        }

        for (int[] p : prerequisites) {
            int course = p[0];
            int pre = p[1];
            adj.get(pre).add(course);
            indegree[course]++;
        }

        //step-2 : adding courses with indegree 0 in queue.

        Queue<Integer> q = new LinkedList<>();
        for (int i = 0; i < numCourses; i++) {
            if (indegree[i] == 0) {
                q.add(i);
            }
        }

        //step -3 : bfs

        int count = 0;
        while(!q.isEmpty()) {
            int curr = q.poll();
            count++;
            
            for (int neighbour : adj.get(curr)) {
                indegree[neighbour]--;
                if (indegree[neighbour] == 0) {
                    q.add(neighbour);
                }
            }
        }

        if (count == numCourses) {
            return true;
        }
        else {
            return false;
        }
    }
}
