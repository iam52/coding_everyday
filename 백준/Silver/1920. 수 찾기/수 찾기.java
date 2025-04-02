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
            int left = 0;
            int right = nArr.length - 1;
            int found = 0;

            while (left <= right) {
                int mid = left + (right - left) / 2;

                if (nArr[mid] == target) {
                    found = 1;
                    break;
                } else if (nArr[mid] < target) {
                    left = mid + 1;
                } else {
                    right = mid - 1;
                }
            }
            System.out.println(found);

        }
    }
}