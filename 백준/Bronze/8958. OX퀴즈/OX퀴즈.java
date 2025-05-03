import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int t = Integer.parseInt(br.readLine());

        for (int i = 0; i < t; i++) {
            char[] testCase = br.readLine().toCharArray();

            int result = 0;
            int count = 0;
            for (int j = 0; j < testCase.length; j++) {
                if (testCase[j] == 'O') {
                    count++;
                    result += count;
                } else if (testCase[j] == 'X') {
                    count = 0;
                }
            }
            
            System.out.println(result);
        }
    }
}