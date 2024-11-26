package org.example;

import java.util.ArrayList;
import java.util.List;

public class BuildingRoads {

    private int n; // Number of nodes
    private List<Integer>[] adj; // Adjacency list
    private boolean[] vis; // Visited array
    private List<Integer> ans; // Stores the start of each connected component

    // Constructor to initialize the graph
    public BuildingRoads(int n) {
        this.n = n;
        this.adj = new ArrayList[n + 1];
        this.vis = new boolean[n + 1];
        this.ans = new ArrayList<>();

        for (int i = 1; i <= n; i++) {
            this.adj[i] = new ArrayList<>();
        }
    }

    // Add an edge to the graph
    public void addEdge(int u, int v) {
        adj[u].add(v);
        adj[v].add(u);
    }

    // Depth-first search (DFS)
    private void dfs(int u) {
        vis[u] = true;
        for (int v : adj[u]) {
            if (!vis[v]) {
                dfs(v);
            }
        }
    }

    // Find connected components and return the count
    public int findConnectedComponents() {
        int componentsCount = 0;

        for (int i = 1; i <= n; i++) {
            if (!vis[i]) {
                componentsCount++;
                ans.add(i); // Add the start of this component
                dfs(i);
            }
        }

        return componentsCount - 1; // Adjust based on the problem
    }

    // Get the list of connections between components
    public List<int[]> getComponentConnections() {
        List<int[]> connections = new ArrayList<>();

        for (int i = 0; i < ans.size() - 1; i++) {
            connections.add(new int[]{ans.get(i), ans.get(i + 1)});
        }

        return connections;
    }
}
