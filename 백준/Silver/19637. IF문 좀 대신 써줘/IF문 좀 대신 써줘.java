import java.util.*;
import java.io.*;

public class Main {
    public static int binarySearch(int[] arr, int target) {
        int left = 0;
        int right = arr.length - 1;
        int result = arr.length;
        
        while (left <= right) {
            int mid = left + (right - left) / 2;
            
            if (arr[mid] >= target) {
                result = mid;
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }
        
        return result;
    }
    
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        
        String[] titles = new String[n];
        int[] limits = new int[n];
        
        for (int i = 0; i < n; i++) {
            String[] parts = br.readLine().split(" ");
            titles[i] = parts[0];
            limits[i] = Integer.parseInt(parts[1]);
        }
        
        StringBuilder sb = new StringBuilder();
        while (m-- > 0) {
            int power = Integer.parseInt(br.readLine());
            int index = binarySearch(limits, power);
            sb.append(titles[index]).append("\n");
        }
        
        System.out.println(sb);
    }
}