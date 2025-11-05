import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int n = Integer.parseInt(br.readLine());
        
        int[][] person = new int[n][2];
        
        for (int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            person[i][0] = Integer.parseInt(st.nextToken());
            person[i][1] = Integer.parseInt(st.nextToken());
        }
        
        int[] ranks = new int[n];
        
        for (int i = 0; i < n; i++) {
            int rank = 1;
            
            for (int j = 0; j < n; j++) {
                if (person[j][0] > person[i][0] && person[j][1] > person[i][1]) {
                    rank++;
                }
            }
            
            ranks[i] = rank;
        }
        
        for (int i = 0; i < n; i++) {
            System.out.print(ranks[i] + " ");
        }
    }
}