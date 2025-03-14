import java.util.*;

public class Main {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        Queue<Integer> queue1 = new LinkedList<>();
        Queue<Integer> queue2 = new LinkedList<>();

        for (int i = 1; i <= n; i++) {
            queue1.add(i);
        }

        for (int i = 1; i < n; i++) {
            queue2.add(queue1.remove());
            queue1.add(queue1.remove());
            System.out.print(queue2.remove() + " ");
        }

        System.out.println(queue1.peek());
    }
}