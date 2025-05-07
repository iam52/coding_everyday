import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        int[] existingTrees = new int[n];
        for (int i = 0; i < n; i++) {
            existingTrees[i] = Integer.parseInt(br.readLine());
        }

        int[] space = new int[n - 1];
        for (int i = 0; i < n - 1; i++) {
            space[i] = existingTrees[i + 1] - existingTrees[i];
        }

        int totalGcd = space[0];
        for (int i = 1; i < space.length; i++) {
            int x = totalGcd;
            int y = space[i];

            while (y != 0) {
                int temp = x % y;
                x = y;
                y = temp;
            }
            totalGcd = x;
        }

        int sum = 0;
        for (int s : space) {
            sum += (s / totalGcd) - 1;
        }

        System.out.println(sum);
    }
}