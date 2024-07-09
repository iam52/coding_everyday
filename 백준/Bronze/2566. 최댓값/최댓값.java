import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int[][] nums = new int[9][9];

        int max = 0;
        int idx1 = 0;
        int idx2 = 0;
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                nums[i][j] = sc.nextInt();
                if (nums[i][j] > max) {
                    max = nums[i][j];
                    idx1 = i;
                    idx2 = j;
                }
            }
        }
        System.out.println(max);
        System.out.print(idx1 + 1 + " ");
        System.out.print(idx2 + 1);
    }
}