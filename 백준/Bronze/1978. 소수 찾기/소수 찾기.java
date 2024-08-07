import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        
        int primeCnt = 0;
        
        for (int i = 0; i < N; i++) {
            int num = sc.nextInt();
            
            boolean isPrime = true;
            
            if (num <= 1) {
                isPrime = false;
            } else {
                for (int j = 2; j < num; j++) {
                    if (num % j == 0) {
                        isPrime = false;
                        break;
                    }
                }
            }
            if (isPrime) primeCnt++;
        }
        System.out.println(primeCnt);    
    }
}