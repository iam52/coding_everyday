import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        StringTokenizer st = new StringTokenizer(br.readLine());
        int a1 = Integer.parseInt(st.nextToken());
        int a0 = Integer.parseInt(st.nextToken());
        
        int c = Integer.parseInt(br.readLine());
        
        int n0 = Integer.parseInt(br.readLine());
        
        boolean satisfies = true;
        
        for (int i = n0; i <= 100; i++) {
            int f = a1 * i + a0;
            int cg = c * i;
            
            if (f > cg) {
                satisfies = false;
                break;
            }
        }
        
        System.out.println(satisfies ? 1 : 0);
    }
}