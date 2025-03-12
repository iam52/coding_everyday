import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt();
        
        Stack<Integer> stack = new Stack<>();
        int sum = 0;
        
        for (int i = 0; i < k; i++) {
            int num = sc.nextInt();
            
            if (num != 0) {
                stack.push(num);
            } else {
                stack.pop();
            }
        }
        
        for (int value : stack) {
            sum += value;
        }
        
        System.out.println(sum);
    }
}