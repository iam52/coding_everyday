import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        while (true) {
            int n = sc.nextInt();
            if (n == -1) break;
            
            int sum = 0;
            String factors = "";
            
            for (int i = 1; i < n; i++) {
                if (n % i == 0) {
                    sum += i;
                    if (factors.isEmpty()) {
                        factors += i;
                    } else {
                        factors += " + " + i;
                    }
                }
            }
            if (n == sum) {
                System.out.println(n + " = " + factors);
            } else {
                System.out.println(n + " is NOT perfect.");
            }
        }
    }
}