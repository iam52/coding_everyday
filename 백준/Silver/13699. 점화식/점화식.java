import java.math.BigInteger;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        
        BigInteger[] t = new BigInteger[n+1];
        t[0] = BigInteger.ONE;
        
        for (int i = 1; i <= n; i++) {
            t[i] = BigInteger.ZERO;
            for (int j = 0; j < i; j++) {
                t[i] = t[i].add(t[j].multiply(t[i-j-1]));
            }
        }
        System.out.println(t[n]);
    }
}