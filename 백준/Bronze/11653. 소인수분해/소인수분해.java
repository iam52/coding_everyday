import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int n = Integer.parseInt(br.readLine());

        int divider = 2;
        while (n != 1) {
            if (n % divider == 0) {
                sb.append(divider).append("\n");
                n /= divider;
            } else {
                divider++;
            }
        }

        System.out.println(sb);
    }
}