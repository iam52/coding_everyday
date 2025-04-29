import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int n = Integer.parseInt(br.readLine());
        
        Map<Integer, Integer> myCards = new HashMap<>();
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            int num = Integer.parseInt(st.nextToken());
            if (myCards.containsKey(num)) {
                myCards.put(num, myCards.get(num) + 1);
            } else {
                myCards.put(num, 1);
            }
        }
        
        int m = Integer.parseInt(br.readLine());
        
        StringBuilder result = new StringBuilder();
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < m; i++) {
            int target = Integer.parseInt(st.nextToken());
            if (myCards.containsKey(target)) {
                result.append(myCards.get(target)).append(" ");
            } else {
                result.append(0).append(" ");
            }
        }
        
        System.out.println(result);
    }
}