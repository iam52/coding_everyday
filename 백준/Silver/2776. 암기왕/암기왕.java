import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder result = new StringBuilder();
        
        int t = Integer.parseInt(br.readLine());
        
        while (t-- > 0) {
            int n = Integer.parseInt(br.readLine());
            int[] note1 = new int[n] ;
            StringTokenizer st = new StringTokenizer(br.readLine());
            for (int i = 0; i < note1.length; i++) {
                note1[i] = Integer.parseInt(st.nextToken());
            }
            
            int m = Integer.parseInt(br.readLine());
            int[] note2 = new int[m];
            st = new StringTokenizer(br.readLine());
            for (int i = 0; i < note2.length; i++) {
                note2[i] = Integer.parseInt(st.nextToken());
            }
            
            Arrays.sort(note1);
            
            for (int target : note2) {
                int left = 0;
                int right = note1.length - 1;
                boolean found = false;
                
                while (left <= right) {
                    int mid = left + (right - left) / 2;
                    
                    if (note1[mid] == target) {
                        found = true;
                        break;
                    } else if (note1[mid] < target) {
                        left = mid + 1;
                    } else {
                        right = mid - 1;
                    }
                }
                result.append(found ? 1 : 0).append("\n");
            }
        }
        System.out.println(result);
    }
}