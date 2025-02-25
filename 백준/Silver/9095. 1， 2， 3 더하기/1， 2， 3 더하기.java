import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int T = sc.nextInt();
        
        for (int i = 0; i < T; i++) {
            int n = sc.nextInt();
            System.out.println(combi(n));
        }
    }
    
    public static int combi(int n) {
        Map<Integer, Integer> map = new HashMap<>();
        map.put(0, 0);
        for (int i = 1; i <= n + 1; i++) {
            int f;
            if (i <= 2) {
                f = 1;
            } else {
                f = map.get(i - 1) + map.get(i - 2) + map.get(i - 3);
            }
            map.put(i, f);
        }
        return map.get(n+1);
    }
}