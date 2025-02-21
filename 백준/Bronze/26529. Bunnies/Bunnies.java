import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        Map<Integer, Integer> map = new HashMap<>();
        
        for (int i = 0; i < n; i++) {
            int months = sc.nextInt(); 
            
            for (int j = 1; j <= months+1; j++) {
                int f;
                if (j <= 2) {
                    f = 1;
                } else {
                    f = map.get(j-1) + map.get(j-2);
                }
                map.put(j, f);
            }
            System.out.println(map.get(months+1));
        }
    }
}