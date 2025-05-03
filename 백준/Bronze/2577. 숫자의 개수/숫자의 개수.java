import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int a = Integer.parseInt(br.readLine());
        int b = Integer.parseInt(br.readLine());
        int c = Integer.parseInt(br.readLine());
        
        int[] counts = new int[10];
        
        int multiplication = a * b * c;
        String toStr = String.valueOf(multiplication);
        
        for (char ch : toStr.toCharArray()) {
            int idx = Character.getNumericValue(ch);
            counts[idx]++;
        }
        
        for (int count : counts) {
            System.out.println(count);
        }
    }
}