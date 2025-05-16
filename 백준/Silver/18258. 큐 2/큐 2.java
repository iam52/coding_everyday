import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int n = Integer.parseInt(br.readLine());

        Deque<Integer> deque = new ArrayDeque<>();


        for (int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            String command = st.nextToken();

            switch (command) {
                case "push":
                    int num = Integer.parseInt(st.nextToken());
                    deque.addLast(num);
                    break;
                case "pop":
                    sb.append(!deque.isEmpty() ? deque.pollFirst() : -1).append("\n");
                    break;
                case "size":
                    sb.append(deque.size()).append("\n");
                    break;
                case "empty":
                    sb.append(deque.isEmpty() ? 1 : 0).append("\n");
                    break;
                case "front":
                    sb.append(!deque.isEmpty() ? deque.peekFirst() : -1).append("\n");
                    break;
                case "back":
                    sb.append(!deque.isEmpty() ? deque.peekLast() : -1).append("\n");
                    break;

            }
        }
        
        System.out.println(sb);
    }
}
