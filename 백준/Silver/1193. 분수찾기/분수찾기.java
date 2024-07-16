import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int X = sc.nextInt();
        
        int sum = 0;
        int i = 0;
        while (sum < X) sum += ++i;
        
        int numerator = (i % 2 == 0) ? i - (sum - X) : sum - X + 1;
        int denominator = (i % 2 == 0) ? sum - X + 1 : i - (sum - X);
        
        System.out.println(numerator + "/" + denominator);
    }
}