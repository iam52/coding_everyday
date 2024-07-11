import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int B = sc.nextInt();
        
        System.out.println(convert(N, B));
    }
    
    public static String convert(int N, int B) {
        
        if (N == 0) return "0";
        
        StringBuilder result = new StringBuilder();
        String digits = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        
        while (N > 0) {
            result.insert(0, digits.charAt(N % B));
            N /= B;
        }
        return result.toString();
    }
}