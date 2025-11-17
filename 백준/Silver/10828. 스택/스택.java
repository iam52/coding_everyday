import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        Stack<Integer> stack = new Stack<>();

        for (int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            String order = st.nextToken();

            if (order.equals("push")) {
                int num = Integer.parseInt(st.nextToken());
                stack.add(num);
            } else if (order.equals("pop")) {
                System.out.println(stack.isEmpty() ? -1 : stack.pop());
            } else if (order.equals("size")) {
                System.out.println(stack.size());
            } else if (order.equals("empty")) {
                System.out.println(stack.isEmpty() ? 1 : 0);
            } else if (order.equals("top")) {
                System.out.println(stack.isEmpty() ? -1 : stack.peek());
            }
        }
    }
}
