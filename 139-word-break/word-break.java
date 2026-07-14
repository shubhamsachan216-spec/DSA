class Solution {
    int[] dp;

    public boolean wordBreak(String s, List<String> wordDict) {
        HashSet<String> set = new HashSet<>(wordDict);
        dp = new int[s.length()];

        Arrays.fill(dp, -1);

        return solve(s, 0, set);
    }

    private boolean solve(String s, int i, HashSet<String> set) {

        if (i == s.length())
            return true;

        if (dp[i] != -1)
            return dp[i] == 1;

        for (int k = i; k < s.length(); k++) {

            String left = s.substring(i, k + 1);

            if (set.contains(left) && solve(s, k + 1, set)) {
                dp[i] = 1;
                return true;
            }
        }

        dp[i] = 0;
        return false;
    }
}