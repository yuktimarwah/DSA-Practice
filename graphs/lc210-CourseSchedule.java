class Solution {
    public int[] findOrder(int numCourses, int[][] prerequisites) {
        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
        int[] indegree = new int[numCourses];

        for (int i = 0; i < numCourses; i++) {
            adj.add(new ArrayList<>());
        }

        for (int[] p : prerequisites) {
            int course = p[0];
            int pre = p[1];

            adj.get(pre).add(course);
            indegree[course]++;
        }

        int[] ans = new int[numCourses];
        int ptr = -1;

        Queue<Integer> q = new LinkedList<>();

        for (int i = 0; i < numCourses; i++) {
            if (indegree[i] == 0) {
                q.add(i);
            }
        }

        while (!q.isEmpty()) {
            int curr = q.poll();
            ans[++ptr] = curr;

            for (int neighbour : adj.get(curr)) {
                indegree[neighbour]--;
                if (indegree[neighbour] == 0 ) {
                    q.add(neighbour);
                }
            }
        }
       if (ptr != (numCourses-1)) {
        return new int[0];
       }
       else {
        return ans;
       }
    }
}
