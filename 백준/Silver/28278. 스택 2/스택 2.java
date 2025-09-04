import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        Stack<Integer> stack = new Stack<>();

        for (int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int order = Integer.parseInt(st.nextToken());

            if (order == 1) {
                int input = Integer.parseInt(st.nextToken());
                stack.add(input);
            } else if (order == 2) {
                System.out.println(!stack.empty() ? stack.pop() : -1);
            } else if (order == 3) {
                System.out.println(stack.size());
            } else if (order == 4) {
                System.out.println(stack.empty() ? 1 : 0);
            } else if (order == 5) {
                System.out.println(!stack.empty()? stack.peek() : -1);
            }
        }
    }
}
