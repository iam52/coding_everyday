import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        String A = scanner.next();
        String B = scanner.next();
        
        int reversedA = Integer.parseInt(new StringBuilder(A).reverse().toString());
        int reversedB = Integer.parseInt(new StringBuilder(B).reverse().toString());
        
        System.out.println(Math.max(reversedA, reversedB));
    }
}