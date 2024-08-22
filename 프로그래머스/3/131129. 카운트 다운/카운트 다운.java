class Solution {
    public int[] solution(int target) {
        int[] dp = new int[target + 1];
        int[] single = new int[target + 1];
        
        for (int i = 1; i <= target; i++) {
            dp[i] = Integer.MAX_VALUE;
            single[i] = 0;
        }
        
        for (int i = 1; i <= target; i++) {
            // single
            for (int j = 1; j <= 20; j++) {
                if (i >= j && dp[i-j] + 1 <= dp[i]) {
                    if (dp[i-j] + 1 < dp[i] || single[i-j] + 1 > single[i]) {
                        dp[i] = dp[i-j] + 1;
                        single[i] = single[i-j] + 1;         
                    }
                }
            }
            
            // double
            for (int j = 1; j <= 20; j++) {
                if (i >= 2*j && dp[i-2*j] + 1 < dp[i]) {
                    dp[i] = dp[i-2*j] + 1;
                    single[i] = single[i-2*j];
                }
            }
            
            // triple
            for (int j = 1; j <= 20; j++) {
                if (i >= 3*j && dp[i - 3*j] + 1 < dp[i]) {
                    dp[i] = dp[i - 3*j] + 1;
                    single[i] = single[i - 3*j];
                }
            }
            
            // bull
            if (i >= 50 && dp[i - 50] + 1 <= dp[i]) {
                if (dp[i - 50] + 1 < dp[i] || single[i - 50] + 1 > single[i]) {
                    dp[i] = dp[i - 50] + 1;
                    single[i] = single[i - 50] + 1;
                }
            }
        }
        return new int[] {dp[target], single[target]};
    }
}