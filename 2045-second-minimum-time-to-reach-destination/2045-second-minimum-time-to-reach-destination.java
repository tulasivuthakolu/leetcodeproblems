public class Solution {
    public int secondMinimum(int n, int[][] edges, int time, int change) {
        List<List<Integer>> adj = new ArrayList<>();
        for (int i = 0; i <= n; i++) {
            adj.add(new ArrayList<>());
        }
        for (int[] edge : edges) {
            int v1 = edge[0];
            int v2 = edge[1];
            adj.get(v1).add(v2);
            adj.get(v2).add(v1);
        }
        Queue<Integer> queue = new LinkedList<>();
        queue.offer(1);
        int curTime = 0;
        int res = -1;
        List<List<Integer>> visitTimes = new ArrayList<>();
        for (int i = 0; i <= n; i++) {
            visitTimes.add(new ArrayList<>());
        }
        visitTimes.get(1).add(0);
        while (!queue.isEmpty()) {
            int levelSize = queue.size();
            for (int i = 0; i < levelSize; i++) {
                int node = queue.poll();
                if (node == n) {
                    if (res != -1) {
                        return curTime;
                    }
                    res = curTime;
                }
                for (int nei : adj.get(node)) {
                    List<Integer> neiTimes = visitTimes.get(nei);

                    if (neiTimes.isEmpty() || (neiTimes.size() == 1 && !neiTimes.contains(curTime))) {
                        queue.offer(nei);
                        neiTimes.add(curTime);
                    }
                }
            }
            if ((curTime / change) % 2 == 1) {
                curTime += change - (curTime % change);
            }
            curTime += time;
        }

        return -1; 
    }
}