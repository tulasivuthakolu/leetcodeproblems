class Solution {
   public int findTheCity(int n, int[][] edges, int distanceThreshold) {
        int[][] d = new int[n][n];
        for (int i = 0; i < n; i++) {
            Arrays.fill(d[i], 1000000000); // Use a large value as infinity
            d[i][i] = 0;
        }

        for (int[] edge : edges) {
            d[edge[0]][edge[1]] = edge[2];
            d[edge[1]][edge[0]] = edge[2];
        }

        for (int k = 0; k < n; k++) {
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    d[i][j] = Math.min(d[i][j], d[i][k] + d[k][j]);
                }
            }
        }

        int ans = -1;
        int mini = Integer.MAX_VALUE;
        int[] reachable = new int[n];
        for (int i = 0; i < n; i++) {
            int count = 0;
            for (int j = 0; j < n; j++) {
                if (i != j && d[i][j] <= distanceThreshold) {
                    count++;
                }
            }
            reachable[i] = count;
            if (count <= mini) {
                mini = count;
                ans = i;
            }
        }

        return ans;
    }
}