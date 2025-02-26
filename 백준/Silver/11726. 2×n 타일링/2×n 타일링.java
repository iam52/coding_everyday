import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        Map<Integer, Integer> map = new HashMap<>();
        
        for (int i = 1; i <= n+1; i++) {
            int f;
            if (i <= 2) {
                f = 1;
            } else {
                f = (map.get(i - 2) + map.get(i - 1)) % 10007;
            }
            map.put(i, f);
        }
        
        System.out.println(map.get(n+1));
    }
}