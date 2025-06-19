import java.util.*;
import java.io.*;

public class Main {
    static int n, m;
    static int[] arr;
    static boolean[] used;
    static StringBuilder sb = new StringBuilder();
    
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());
        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());
        
        arr = new int[m];
        used = new boolean[n + 1];
        
        backtrack(0);
        System.out.println(sb);
    }
    
    static void backtrack(int depth) {
        if (depth == m) {
            for (int num : arr) {
                sb.append(num).append(' ');
            }
            
            sb.append('\n');
            return;
        }
        
        for (int i = 1; i <= n; i ++) {
            if (!used[i]) {
                used[i] = true;
                arr[depth] = i;
                backtrack(depth + 1);
                used[i] = false;
            }
        }
    }
}