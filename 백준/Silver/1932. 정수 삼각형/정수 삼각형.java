import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        int[][] dp = new int[n][n];
        int[][] sum = new int[n][n];

        for (int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            for (int j = 0; j <= i; j++) {
                dp[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        sum[0][0] = dp[0][0];

        for (int i = 1; i < n; i++) {
            for (int j = 0; j <= i; j++) {
                if (j == 0) {
                    sum[i][j] = sum[i-1][j] + dp[i][j];
                } else if (j == i) {
                    sum[i][j] = sum[i-1][j-1] + dp[i][j];
                } else {
                    sum[i][j] = Math.max(sum[i-1][j-1], sum[i-1][j]) + dp[i][j];
                }
            }
        }

        int answer = 0;
        for (int i = 0; i < n; i++) {
            answer = Math.max(answer, sum[n - 1][i]);
        }

        System.out.println(answer);
    }
}
