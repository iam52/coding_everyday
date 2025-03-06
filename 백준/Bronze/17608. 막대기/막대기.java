import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        
        Stack<Integer> stack = new Stack<>();
        
        for (int i = 0; i < n; i++) {
            stack.push(sc.nextInt());
        }
        
        int count = 1;
        int maxBar = stack.pop();
        
        for (int i = 0; i < n - 1 ; i++) {
            int currentBar = stack.pop();
            if (maxBar < currentBar) {
                count++;
                maxBar = currentBar;
            }
        }
        
        System.out.println(count);
    }
}