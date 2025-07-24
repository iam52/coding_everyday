import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int n = Integer.parseInt(br.readLine());

        int[] sizes = new int[6];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < 6; i++) {
            int size = Integer.parseInt(st.nextToken());
            sizes[i] = size;
        }

        int[] packages = new int[2];
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < 2; i++) {
            int available = Integer.parseInt(st.nextToken());
            packages[i] = available;
        }

        int tAvailable = packages[0];
        int pAvailable = packages[1];

        int tResult = 0;
        for (int size : sizes) {
            tResult += (size == 0 ? 0 : ((size - 1) / tAvailable + 1));
        }

        sb.append(tResult).append("\n");
        sb.append(n / pAvailable).append(" ").append(n % pAvailable);

        System.out.println(sb);
    }
}