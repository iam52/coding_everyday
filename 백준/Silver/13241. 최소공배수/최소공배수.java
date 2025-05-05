import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        
        long a = Integer.parseInt(st.nextToken());
        long b = Integer.parseInt(st.nextToken());
        
        long x = a;
        long y = b;
        
        while (y != 0) {
            long temp = x % y;
            x = y;
            y = temp;
        }
        
        long gcp = x;
        long lcm = a * b / gcp;
        System.out.println(lcm);
    }
}