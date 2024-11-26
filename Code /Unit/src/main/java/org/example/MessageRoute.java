package org.example;
import java.util.*;

public class MessageRoute {

    public String findMessageRoute(int n, int m, List<int[]> edges) {
        // Adjacency list
        List<List<Integer>> adj = new ArrayList<>();
        for (int i = 0; i <= n; i++) {
            adj.add(new ArrayList<>());
        }

        // Add edges to adjacency list
        for (int[] edge : edges) {
            int a = edge[0], b = edge[1];
            adj.get(a).add(b);
            adj.get(b).add(a);
        }

        // BFS variables
        Queue<Integer> queue = new LinkedList<>();
        boolean[] vis = new boolean[n + 1];
        int[] parent = new int[n + 1];
        Arrays.fill(parent, -1);

        vis[1] = true;
        queue.add(1);
        int level = 1;

        // BFS to find the shortest path
        while (!queue.isEmpty()) {
            int size = queue.size();
            while (size-- > 0) {
                int u = queue.poll();

                // If we reach node n, reconstruct the path
                if (u == n) {
                    StringBuilder result = new StringBuilder();
                    result.append(level).append("\n");

                    List<Integer> path = new ArrayList<>();
                    while (u != -1) {
                        path.add(u);
                        u = parent[u];
                    }

                    Collections.reverse(path);
                    for (int node : path) {
                        result.append(node).append(" ");
                    }
                    return result.toString().trim();
                }

                for (int neighbor : adj.get(u)) {
                    if (!vis[neighbor]) {
                        parent[neighbor] = u;
                        vis[neighbor] = true;
                        queue.add(neighbor);
                    }
                }
            }
            level++;
        }

        // If no path exists
        return "IMPOSSIBLE";
    }
}
