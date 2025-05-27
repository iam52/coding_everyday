import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        List<Integer> divisors = new ArrayList<>();

        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            int divisor = Integer.parseInt(st.nextToken());
            divisors.add(divisor);
        }

        divisors.sort(Integer::compareTo);

        if (divisors.get(0) * divisors.get(divisors.size() - 1) != 1 || divisors.get(0) * divisors.get(divisors.size() - 1) != n) {
            System.out.println(divisors.get(0) * divisors.get(divisors.size() - 1));
        }
    }
}