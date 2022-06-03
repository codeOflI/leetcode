package codeofli.leetcode.point_to_offer.dp;

public class Fib10 {

    /**
     * dp
     */
    public int fib(int n) {
        if (n == 0) return 0;          // 若求 f(0) 则直接返回 0
        int dp[] = new int[n+1];
        final int MOD = 1000000007;
        dp[0] = 0;
        dp[1] = 1;
        for (int i = 2; i <= n; i++){
            dp[i] = (dp[i-1] + dp[i-2]) % MOD;
        }
        return dp[n];
    }

    /**
     * 记忆化搜索
     */
    int dp[] = new int[101];
    private int MOD = 1000000007;

    public int fib1(int n) {
        if (n == 0) return 0;
        else if (n == 1) return 1;
        if (dp[n] == 0) {
            dp[n] = (fib(n - 1) + fib(n - 2)) % MOD;
        }
        return dp[n];
    }

    public static void main(String[] args) {
        Fib10 fib10 = new Fib10();
        System.out.println(fib10.fib(100));
        System.out.println(fib10.fib(100) == 687995182);
        System.out.println(fib10.fib(0));
        System.out.println(fib10.fib(0) == 0);
    }
}
