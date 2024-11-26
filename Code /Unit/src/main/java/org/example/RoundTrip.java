package org.example;
import java.util.*;

public class RoundTrip {

    public String determineBipartite(int n, int m, List<int[]> edges) {
        // Create adjacency list
        List<List<Integer>> adj = new ArrayList<>();
        for (int i = 0; i <= n; i++) {
            adj.add(new ArrayList<>());
        }

        // Populate adjacency list
        for (int[] edge : edges) {
            int a = edge[0], b = edge[1];
            adj.get(a).add(b);
            adj.get(b).add(a);
        }

        // Initialize visited array with -1
        int[] vis = new int[n + 1];
        Arrays.fill(vis, -1);

        // Process each component
        for (int i = 1; i <= n; i++) {
            if (vis[i] != -1) continue;

            vis[i] = 1; // Start coloring this component
            Queue<Integer> queue = new LinkedList<>();
            queue.add(i);

            while (!queue.isEmpty()) {
                int u = queue.poll();

                for (int neighbor : adj.get(u)) {
                    if (vis[neighbor] == -1) {
                        vis[neighbor] = (vis[u] == 2) ? 1 : 2; // Alternate colors
                        queue.add(neighbor);
                    } else if (vis[neighbor] == vis[u]) {
                        // Conflict detected
                        return "IMPOSSIBLE";
                    }
                }
            }
        }

        // If no conflicts, return the group assignments
        StringBuilder result = new StringBuilder();
        for (int i = 1; i <= n; i++) {
            result.append(vis[i]).append(" ");
        }

        return result.toString().trim();
    }
}
