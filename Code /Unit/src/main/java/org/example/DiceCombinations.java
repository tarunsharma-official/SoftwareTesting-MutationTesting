package org.example;


public class DiceCombinations {
    private static final int MOD = 1000000007;

    public static int diceCombinations(int n) {
        int[] dp = new int[n + 1];
        dp[0] = 1;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= 6; j++) {
                if (i >= j) {
                    dp[i] = (dp[i] % MOD + dp[i - j] % MOD) % MOD;
                }
            }
        }
        return dp[n] % MOD;
    }
}