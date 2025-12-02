import java.util.*;
import java.io.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
        
        int n = Integer.parseInt(br.readLine());
        int[] a = new int[n];
        
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            a[i] = Integer.parseInt(st.nextToken());
        }
        
        st = new StringTokenizer(br.readLine());
        Deque<Integer> deque = new ArrayDeque<>();
        
        for (int i = 0; i < n; i++) {
            int val = Integer.parseInt(st.nextToken());
            
            if (a[i] == 0) {
                deque.addFirst(val);
            }
        }
        
        int m = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine());
        
        for (int i = 0; i < m; i++) {
            int input = Integer.parseInt(st.nextToken());
            
            deque.addLast(input);
            
            sb.append(deque.pollFirst()).append(" ");
        }
        
        System.out.println(sb);
    }
}