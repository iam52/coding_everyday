import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int t = Integer.parseInt(br.readLine());

        for (int i = 0; i < t; i++) {
            long num = Long.parseLong(br.readLine());

            long currentNum = num;
            while (true) {
                if (isPrime(currentNum)) {
                    System.out.println(currentNum);
                    break;
                }
                currentNum++;
            }
        }
    }

    public static boolean isPrime(long num) {
        if (num < 2) {
            return false;
        } else {
            for (long i = 2; i * i <= num; i++) {
                if (num % i == 0) {
                    return false;
                }
            }
            return true;
        }
    }
}