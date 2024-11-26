package org.example;

import java.util.Arrays;
import java.util.List;

public class GridComponents {
    public static void dfs(int i, int j, List<List<Character>> mat, List<Integer> dr, List<Integer> dc, int n, int m) {
        mat.get(i).set(j, '#');
        for (int k = 0; k < 4; k++) {
            int nr = i + dr.get(k);
            int nc = j + dc.get(k);
            if (nr >= 0 && nc >= 0 && nr < n && nc < m && mat.get(nr).get(nc) == '.') {
                dfs(nr, nc, mat, dr, dc, n, m);
            }
        }
    }

    public static int countComponents(int n, int m, List<List<Character>> mat) {
        int c = 0;
        List<Integer> dr = Arrays.asList(0, 0, -1, 1);
        List<Integer> dc = Arrays.asList(-1, 1, 0, 0);
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (mat.get(i).get(j) == '.') {
                    c++;
                    dfs(i, j, mat, dr, dc, n, m);
                }
            }
        }
        return c;
    }
}