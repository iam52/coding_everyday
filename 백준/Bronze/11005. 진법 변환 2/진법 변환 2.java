import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int B = sc.nextInt();
        
        StringBuilder result = new StringBuilder();
        
        while (N > 0) {
            int remainder = N % B;
            
            if (remainder < 10) {
                result.insert(0, (char) (remainder + '0'));
            } else {
                result.insert(0, (char) (remainder - 10 + 'A'));
            }
            N /= B;
        }
        System.out.println(result);
    }
}