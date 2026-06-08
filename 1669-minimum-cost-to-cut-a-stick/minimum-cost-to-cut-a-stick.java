class Solution {

    int[][] dp;

    public int minCost(int n, int[] cuts) {

        int m = cuts.length;

        int[] arr = new int[m + 2];

        arr[0] = 0;
        arr[m + 1] = n;

        for (int i = 0; i < m; i++) {
            arr[i + 1] = cuts[i];
        }

        Arrays.sort(arr);

        dp = new int[m + 2][m + 2];

        for (int[] row : dp) {
            Arrays.fill(row, -1);
        }

        return solve(1, m, arr);
    }

    private int solve(int i, int j, int[] cuts) {

        if (i > j) return 0;

        if (dp[i][j] != -1) {
            return dp[i][j];
        }

        int ans = Integer.MAX_VALUE;

        for (int k = i; k <= j; k++) {

            int cost =
                    (cuts[j + 1] - cuts[i - 1]) +
                    solve(i, k - 1, cuts) +
                    solve(k + 1, j, cuts);

            ans = Math.min(ans, cost);
        }

        return dp[i][j] = ans;
    }
}