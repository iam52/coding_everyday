import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static boolean isPrime(int num) {
        if (num < 2) return false;
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) 
                return false;
        }
        return true;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int M = sc.nextInt();
        int N = sc.nextInt();
        ArrayList<Integer> primes = new ArrayList<>();
        
        for (int i = M; i <= N; i++) {
            if (isPrime(i)) {
                primes.add(i);
            }
        }
        if (primes.size() > 0) {
            int sum = 0;
            for (int prime : primes) {
                sum += prime;
            }
            System.out.println(sum);
            System.out.println(primes.get(0));
        } else {
            System.out.println(-1);
        }
    }
}