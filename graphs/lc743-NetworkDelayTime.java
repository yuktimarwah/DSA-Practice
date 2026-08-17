class Solution {
    class Pair {
        int node;
        int weight;

        Pair (int node, int weight) {
            this.node = node;
            this.weight = weight;
        }
    }
    public int networkDelayTime(int[][] times, int n, int k) {
        int []dis = new int[n+1];
        Arrays.fill(dis,Integer.MAX_VALUE);

        dis[k] = 0;

        ArrayList<ArrayList<Pair>> adj = new ArrayList<>();

        for (int i = 0; i <= n; i++) {
            adj.add(new ArrayList<>());
        }
        
        for (int[] t : times) {
            int u = t[0];
            int v = t[1];
            int w = t[2];

            adj.get(u).add(new Pair(v,w));
        }
        PriorityQueue<Pair> pq = new PriorityQueue<>((a,b) -> a.weight - b.weight);
        pq.add(new Pair(k,0));

        while (!pq.isEmpty()) {
            Pair curr = pq.poll();
            int no = curr.node;
            int we = curr.weight;

            for (Pair neighbour : adj.get(no)) {
                int newdist = we + neighbour.weight;

                if (newdist < dis[neighbour.node]) {
                    dis[neighbour.node] = newdist;
                    pq.add(new Pair(neighbour.node,newdist));
                }
            }
        }

        int max = 0;

        for (int i = 1; i <= n; i++) {
            if (dis[i] == Integer.MAX_VALUE) {
                return -1;
            }

            max = Math.max(max,dis[i]);
        }
        return max;
    }
}
