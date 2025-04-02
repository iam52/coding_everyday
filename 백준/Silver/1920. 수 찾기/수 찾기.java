import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[] nArr = new int[n];
        for (int i = 0; i < nArr.length; i++) {
            nArr[i] = sc.nextInt();
        }

        Arrays.sort(nArr);

        int m = sc.nextInt();
        int[] mArr = new int[m];
        for (int i = 0; i < mArr.length; i++) {
            mArr[i] = sc.nextInt();
        }

        for (int target : mArr) {
            if (Arrays.binarySearch(nArr, target) >= 0) {
                System.out.println(1);
            } else {
                System.out.println(0);
            }
        }
    }
}