package org.example;

import java.util.List;

public class CoinChange {

    public static int solve(int n, int k, List<Integer> arr, int[] dp) {
        if (k == 0) return 0;
        if (k < 0) return 10000000; // Equivalent to 1e7 in C++
        if (dp[k] != -1) return dp[k];

        int ans;
        int t = Integer.MAX_VALUE;
        for (int i = 0; i < n; i++) {
            ans = 1 + solve(n, k - arr.get(i), arr, dp);
            t = Math.min(ans, t);
        }

        return dp[k] = t;
    }
}