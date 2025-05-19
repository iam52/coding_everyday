import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());

        Queue<Integer> queue = new LinkedList<>();
        for (int i = 1; i <= n; i++) {
            queue.add(i);
        }

        List<Integer> list = new ArrayList<>();

        while (!queue.isEmpty()) {
            for (int i = 0; i < k - 1; i++) {
                queue.add(queue.poll());
            }

            list.add(queue.poll());
        }

        System.out.print("<");
        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i));
            if (i != list.size() - 1) {
                System.out.print(", ");
            }
        }
        System.out.println(">");
    }
}
