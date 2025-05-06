import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int[] numerator = new int[2];
        int[] denominator = new int[2];

        StringTokenizer st = new StringTokenizer(br.readLine());
        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        numerator[0] = a;
        denominator[0] = b;

        st = new StringTokenizer(br.readLine());
        int c = Integer.parseInt(st.nextToken());
        int d = Integer.parseInt(st.nextToken());
        numerator[1] = c;
        denominator[1] = d;

        int numerSum = (numerator[0] * denominator[1]) + (denominator[0] * numerator[1]);
        int denomMul = denominator[0] * denominator[1];

        int x = numerSum;
        int y = denomMul;

        while (y != 0) {
            int temp = x % y;
            x = y;
            y = temp;
        }

        int gcp = x;

        int reducedNumer = numerSum / gcp;
        int reducedDenom = denomMul / gcp;

        sb.append(reducedNumer).append(" ").append(reducedDenom);

        System.out.println(sb);
    }
}