import java.util.*;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[] nList = new int[n];
        for (int i = 0; i < n; i++) {
            int nNums = sc.nextInt();
            nList[i] = nNums;
        }
        Arrays.sort(nList);

        int m = sc.nextInt();

        int[] mList = new int[m];
        for (int i = 0; i < m; i++) {
            int mNums = sc.nextInt();
            mList[i] = mNums;
        }

        for (int t : mList) {
            if (Arrays.binarySearch(nList, t) >= 0) {
                System.out.print("1" + " ");
            } else {
                System.out.print("0" + " ");
            }
        }

    }
}