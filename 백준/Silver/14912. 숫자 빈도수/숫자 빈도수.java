import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int d = Integer.parseInt(st.nextToken());

        int count = 0;
        
        for (int i = 1; i <= n; i++) {
            String numStr = Integer.toString(i);
            
            char[] digits = numStr.toCharArray();
            
            for (char digit : digits) {
                if (Character.getNumericValue(digit) == d) {
                    count++;
                }
            }
        }
        
        System.out.println(count);
    }
}