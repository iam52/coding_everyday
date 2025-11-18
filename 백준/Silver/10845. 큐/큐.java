import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        Deque<Integer> queue = new ArrayDeque<>();

        for (int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            String order = st.nextToken();

            if (order.equals("push")) {
                int num = Integer.parseInt(st.nextToken());
                queue.add(num);
            } else if (order.equals("pop")) {
                System.out.println(queue.isEmpty() ? -1 : queue.poll());
            } else if (order.equals("size")) {
                System.out.println(queue.size());
            } else if (order.equals("empty")) {
                System.out.println(queue.isEmpty() ? 1 : 0);
            } else if (order.equals("front")) {
                System.out.println(queue.isEmpty() ? -1 : queue.peekFirst());
            } else if (order.equals("back")) {
                System.out.println(queue.isEmpty() ? -1 : queue.peekLast());
            }
        }
    }
}