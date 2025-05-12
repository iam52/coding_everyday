import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());

        boolean[] primes = new boolean[1000001];
        List<Integer> primeList = new ArrayList<>();
        Arrays.fill(primes, true);
        primes[0] = primes[1] = false;

        for (int i = 2; i * i <= 1000000; i++) {
            if (primes[i]) {
                for (int j = i * i; j <= 1000000; j += i) {
                    primes[j] = false;
                }
            }
        }

        for (int i = 2; i <= 1000000; i++) {
            if (primes[i]) {
                primeList.add(i);
            }
        }

        for (int i = 0; i < t; i++) {
            int n = Integer.parseInt(br.readLine());
            int count = 0;

            for (int j = 0; j < primeList.size(); j++) {
                int p1 = primeList.get(j);
                if (p1 > n / 2) break;
                int p2 = n - p1;
                if (primes[p2] && p1 <= p2) {
                    count++;
                }
            }
            System.out.println(count);
        }
    }
}