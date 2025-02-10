import java.util.*;

public class Main {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        
        long n = scanner.nextLong();
        
        if (n % 4 == 1 || n % 4 == 3) {
            System.out.println("SK");
        } else if (n % 4 == 0 || n % 4 == 2) {
            System.out.println("CY");
        }
        
    }
}