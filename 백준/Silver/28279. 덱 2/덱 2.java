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
            int num = Integer.parseInt(st.nextToken());

            if (num == 1) {
                int x = Integer.parseInt(st.nextToken());
                deque.addFirst(x);
            } else if (num == 2) {
                int x = Integer.parseInt(st.nextToken());
                deque.addLast(x);
            } else if (num == 3) {
                System.out.println(!deque.isEmpty() ? deque.pollFirst() : -1);
            } else if (num == 4) {
                System.out.println(!deque.isEmpty() ? deque.pollLast() : -1);
            } else if (num == 5) {
                System.out.println(deque.size());
            } else if (num == 6) {
                System.out.println(deque.isEmpty() ? 1 : 0);
            } else if (num == 7) {
                System.out.println(!deque.isEmpty() ? deque.peekFirst() : -1);
            } else if (num == 8) {
                System.out.println(!deque.isEmpty() ? deque.peekLast() : -1);
            }
        }
    }
}
