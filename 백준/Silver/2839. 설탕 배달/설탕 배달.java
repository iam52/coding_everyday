import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int n = Integer.parseInt(br.readLine());
        
        int count = -1;
        for (int i = n / 5; i >= 0; i--) {
            int remainder = n - (i * 5);
            if (remainder % 3 == 0) {
                int j = remainder / 3;
                count = i + j;
                break;
            }
        }
        
        System.out.println(count);
    }
}