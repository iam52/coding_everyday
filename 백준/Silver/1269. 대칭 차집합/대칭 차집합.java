import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        
        Map<Integer, Integer> map = new HashMap<>();
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            var elementsA = Integer.parseInt(st.nextToken());
            
            if (map.containsKey(elementsA)) {
                map.put(elementsA, map.get(elementsA) + 1);
            } else {
                map.put(elementsA, 1);
            }
        }
        
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < m; i++) {
            var elementsB = Integer.parseInt(st.nextToken());
            
            if (map.containsKey(elementsB)) {
                map.put(elementsB, map.get(elementsB) + 1);
            } else {
                map.put(elementsB, 1);
            }
        }
        
        int result = 0;
        for (int count : map.values()) {
            if (count == 1) {
                result++;
            }
        }
        
        System.out.println(result);
    }
}