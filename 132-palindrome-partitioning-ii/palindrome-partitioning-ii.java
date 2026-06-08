class Solution {
    public int minCut(String s) {
        int n = s.length();

        boolean[][] pal = new boolean[n][n];

        for (int len = 1; len <= n; len++) {
            for (int i = 0; i + len - 1 < n; i++) {
                int j = i + len - 1;

                if (len == 1) {
                    pal[i][j] = true;
                } else if (len == 2) {
                    pal[i][j] = (s.charAt(i) == s.charAt(j));
                } else {
                    pal[i][j] =
                        (s.charAt(i) == s.charAt(j)) &&
                        pal[i + 1][j - 1];
                }
            }
        }

        int[] dp = new int[n];

        for (int i = 0; i < n; i++) {

            if (pal[0][i]) {
                dp[i] = 0;
                continue;
            }

            dp[i] = Integer.MAX_VALUE;

            for (int j = 0; j < i; j++) {
                if (pal[j + 1][i]) {
                    dp[i] = Math.min(dp[i], dp[j] + 1);
                }
            }
        }

        return dp[n - 1];
    }
}