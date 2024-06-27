import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        
        String stars = "";
        for (int i = 0; i < T; i++) {
            stars += "*";
            
            System.out.println(stars);
        }
    }
}