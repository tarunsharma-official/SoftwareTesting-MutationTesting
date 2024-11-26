package org.example;
import java.util.*;

public class Labyrinth {

    private char[][] ar; // Grid representation
    private char[][] br; // Direction tracker
    private boolean[][] vis; // Visited tracker
    private int n, m; // Dimensions of the grid
    private List<Character> path; // Path to store directions

    public void GridPathFinder(int n, int m, char[][] grid) {
        this.n = n;
        this.m = m;
        this.ar = grid;
        this.br = new char[n + 1][m + 1];
        this.vis = new boolean[n + 1][m + 1];
        this.path = new ArrayList<>();
    }

    // Checks if a cell is valid to visit
    private boolean isValid(int x, int y) {
        return x >= 1 && x <= n && y >= 1 && y <= m && ar[x][y] != '#' && !vis[x][y];
    }

    // BFS to find the path from 'A' to 'B'
    public boolean bfs(int startX, int startY) {
        Queue<int[]> queue = new LinkedList<>();
        queue.add(new int[]{startX, startY});
        vis[startX][startY] = true;

        while (!queue.isEmpty()) {
            int[] current = queue.poll();
            int a = current[0];
            int b = current[1];

            if (ar[a][b] == 'B') {
                while (true) {
                    path.add(br[a][b]);

                    if (path.get(path.size() - 1) == 'L') b++;
                    else if (path.get(path.size() - 1) == 'R') b--;
                    else if (path.get(path.size() - 1) == 'U') a++;
                    else if (path.get(path.size() - 1) == 'D') a--;

                    if (a == startX && b == startY) break;
                }
                return true;
            }

            // Explore left
            if (isValid(a, b - 1)) {
                br[a][b - 1] = 'L';
                queue.add(new int[]{a, b - 1});
                vis[a][b - 1] = true;
            }

            // Explore right
            if (isValid(a, b + 1)) {
                br[a][b + 1] = 'R';
                queue.add(new int[]{a, b + 1});
                vis[a][b + 1] = true;
            }

            // Explore up
            if (isValid(a - 1, b)) {
                br[a - 1][b] = 'U';
                queue.add(new int[]{a - 1, b});
                vis[a - 1][b] = true;
            }

            // Explore down
            if (isValid(a + 1, b)) {
                br[a + 1][b] = 'D';
                queue.add(new int[]{a + 1, b});
                vis[a + 1][b] = true;
            }
        }

        return false;
    }

    // Getter for the path
    public List<Character> getPath() {
        Collections.reverse(path); // Reverse the path for correct order
        return path;
    }
}
