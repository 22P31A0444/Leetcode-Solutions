class Solution {
    public int maxSumDivThree(int[] nums) {
        int[] dp = new int[3];
        dp[0] = 0;
        dp[1] = Integer.MIN_VALUE / 2;
        dp[2] = Integer.MIN_VALUE / 2;

        for (int x : nums) {
            int[] next = dp.clone();
            for (int r = 0; r < 3; r++) {
                int newR = (r + x) % 3;
                next[newR] = Math.max(next[newR], dp[r] + x);
            }
            dp = next;
        }

        return dp[0];
    }
}
