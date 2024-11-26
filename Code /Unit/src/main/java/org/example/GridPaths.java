package org.example;

import java.util.List;

public class GridPaths {
    private static final int MOD = 1000000007;

    public static long solve(int i, int j, List<List<Character>> a, int n, List<List<Long>> dp) {
        if (i == n - 1 && j == n - 1 && a.get(i).get(j) == '.') return 1;
        long left = 0, down = 0;
        if (dp.get(i).get(j) != -1) return dp.get(i).get(j);
        if (i + 1 < n && j < n && a.get(i + 1).get(j) != '*')
            left = solve(i + 1, j, a, n, dp);
        if (j + 1 < n && i < n && a.get(i).get(j + 1) != '*')
            down = solve(i, j + 1, a, n, dp);
        dp.get(i).set(j, (left % MOD + down % MOD) % MOD);
        return dp.get(i).get(j);
    }
}