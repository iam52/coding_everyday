import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int[] remain = new int[10];
        int cnt = 0;

        for (int i = 0; i < remain.length; i++) {
            int num = sc.nextInt();
            remain[i] = num % 42;

            for (int j = 0; j <= i; j++) {
                if (i != j && remain[i] == remain[j]) {
                    remain[i] = -1;
                }
            }
        }
        for (int i : remain) {
            if (i != -1) {
                cnt++;
            }
        }
        System.out.println(cnt);
    }
}