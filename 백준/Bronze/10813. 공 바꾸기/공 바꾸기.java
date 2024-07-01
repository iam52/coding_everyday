import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();

        int[] baskets = new int[N + 1];
        for (int k = 0; k <= N; k++) {
            baskets[k] = k;
        }

        for (int l = 1; l <= M; l++) {
            int i = sc.nextInt();
            int j = sc.nextInt();
            int tmp = 0;

            tmp = baskets[i];
            baskets[i] = baskets[j];
            baskets[j] = tmp;
        }

        for (int l = 1; l <= N; l++) {
            System.out.print(baskets[l] + " ");
        }
    }
}