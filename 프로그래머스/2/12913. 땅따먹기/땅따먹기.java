class Solution {
    int solution(int[][] land) {
        for (int i = 1; i < land.length; i++) {
            for (int j = 0; j < 4; j++) {
                int max = 0;
                for (int k = 0; k < 4; k++) {
                    if (j != k) {
                        max = Math.max(max, land[i - 1][k]);

                    }
                }

                land[i][j] += max;
            }
        }

        int answer = 0;
        for (int j = 0; j < 4; j++) {
            answer = Math.max(answer, land[land.length - 1][j]);
        }

        return answer;
    }
}