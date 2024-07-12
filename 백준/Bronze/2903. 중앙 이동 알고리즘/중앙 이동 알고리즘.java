import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        int square = 0;
        int gap = 3;

        for (int i = 0; i <= N; i++) {
            square = (int) Math.pow(4, i);
        }

        for (int i = 1; i <= N; i++) {
            int dot = ((int) Math.pow(2, i));
            gap += dot;
        }

        System.out.println(square + gap);
    }
}