import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int k = Integer.parseInt(br.readLine());

        Stack<Integer> stack = new Stack<>();

        for (int i = 0; i < k; i++) {
            int num = Integer.parseInt(br.readLine());

            if (num == 0) {
                stack.pop();
            } else {
                stack.add(num);
            }
        }

        int result = 0;
        if (stack.isEmpty()) {
            System.out.println(0);
        } else {
            for (int s : stack) {
                result += s;
            }

            System.out.println(result);
        }
    }
}