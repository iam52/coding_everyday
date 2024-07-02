import java.util.*;

public class Main {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        
        ArrayList<Integer> baskets = new ArrayList<>();
        for (int i = 1; i <= N; i++) {
            baskets.add(i);
        }
        
        for (int k = 0; k < M; k++) {
            int i = sc.nextInt() - 1;
            int j = sc.nextInt();
            Collections.reverse(baskets.subList(i, j));
        }
        
        for (int basket : baskets) {
            System.out.print(basket + " ");
        }
    }
}