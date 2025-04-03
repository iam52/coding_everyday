import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        int t = Integer.parseInt(br.readLine());
        
        while(t-- > 0) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int n = Integer.parseInt(st.nextToken());
            int m = Integer.parseInt(st.nextToken());
            
            int[] a = new int[n];
            st = new StringTokenizer(br.readLine());
            for (int i = 0; i < n; i++) {
                a[i] = Integer.parseInt(st.nextToken());
            }
            
            int[] b = new int[m];
            st = new StringTokenizer(br.readLine());
            for (int i = 0; i < m; i++) {
                b[i] = Integer.parseInt(st.nextToken());
            }
            
            Arrays.sort(b);
            
            int total = 0;
            for (int num : a) {
                total += countSmaller(b, num);
            }
            bw.write(total + "\n");
        }
        
        bw.flush();
        bw.close();
    }
    
    public static int countSmaller(int[] arr, int target) {
        int left = 0;
        int right = arr.length - 1;
        int result = 0;
        
        while (left <= right) {
            int mid = left + (right - left) / 2;
            
            if (arr[mid] < target) {
                result = mid + 1;
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        
        return result;
    }
}