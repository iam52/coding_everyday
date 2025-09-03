import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int n = Integer.parseInt(br.readLine());
        int[] arrN = new int[n];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            int myCard = Integer.parseInt(st.nextToken());
            arrN[i] = myCard;
        }
        
        Arrays.sort(arrN);
        
        int m = Integer.parseInt(br.readLine());
        int[] arrM = new int[m];
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < m; i++) {
            int yourCard = Integer.parseInt(st.nextToken());
            arrM[i] = yourCard;
        }
        
        for (int card : arrM) {
            sb.append(binarySearch(arrN, card)).append(" ");
        }
        
        System.out.println(sb);
    }
    
    private static int binarySearch(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (arr[mid] == target) {
                return 1;
            } else {
                if (arr[mid] < target) {
                    start = mid + 1;
                } else {
                    end = mid - 1;
                }
            }
        }

        return 0;
    }
}