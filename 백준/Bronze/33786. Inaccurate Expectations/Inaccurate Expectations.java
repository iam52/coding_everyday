import java.io.*;
import java.math.BigInteger;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        System.out.println(countFiles(n));
    }

    public static BigInteger countFiles(int n) {
        BigInteger total = BigInteger.ZERO;
        for (int i = 1; i <= n; i++) {
            BigInteger current = BigInteger.valueOf(i);
            total = current.add(current.multiply(total));
        }
        return total;
    }
}
