import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int n = Integer.parseInt(br.readLine());
        
        int endingNum = 666;
        int countToN = 0;
        
        while (true) {
            String numToStr = Integer.toString(endingNum);
            
            if (numToStr.contains("666")) {
                countToN++;
                
                if (countToN == n) {
                    System.out.println(endingNum);
                    break;
                }
            }
            
            endingNum++;
        }
    }
}