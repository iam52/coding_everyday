import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        String N = sc.next();
        int B = sc.nextInt();
        
        System.out.println(Long.parseLong(N, B));
    }
}