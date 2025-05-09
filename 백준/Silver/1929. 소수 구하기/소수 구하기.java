import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int m = Integer.parseInt(st.nextToken());
        int n = Integer.parseInt(st.nextToken());
        
        boolean[] nonPrime = new boolean[n + 1];
        
        nonPrime[0] = nonPrime[1] = true;
        
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (!nonPrime[i]) {
                for (int j = i * i; j <= n; j += i) {
                    nonPrime[j] = true;
                }
            }
        }
        
        StringBuilder sb = new StringBuilder();
        for (int i = m; i <= n; i++) {
            if (!nonPrime[i]) {
                sb.append(i).append("\n");
            }
        }
        
        System.out.println(sb);
    }
}