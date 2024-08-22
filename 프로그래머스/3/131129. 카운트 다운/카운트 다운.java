import java.util.*;

class Solution {
    public int[] solution(int target) {
        int[] dp = new int[target + 1];
        int[] singles = new int[target + 1];
        Arrays.fill(dp, Integer.MAX_VALUE);
        dp[0] = 0;
        
        List<Integer> scores = new ArrayList<>();
        for (int i = 1; i <= 20; i++) {
            scores.add(i);  // 싱글
            scores.add(i * 2);  // 더블
            scores.add(i * 3);  // 트리플
        }
        scores.add(50);  // 불
        
        for (int i = 1; i <= target; i++) {
            for (int score : scores) {
                if (score > i) continue;
                if (dp[i - score] == Integer.MAX_VALUE) continue;
                
                if (dp[i - score] + 1 < dp[i] || 
                   (dp[i - score] + 1 == dp[i] && singles[i - score] + (score <= 20 || score == 50 ? 1 : 0) > singles[i])) {
                    dp[i] = dp[i - score] + 1;
                    singles[i] = singles[i - score] + (score <= 20 || score == 50 ? 1 : 0);
                }
            }
        }
        
        return new int[]{dp[target], singles[target]};
    }
}