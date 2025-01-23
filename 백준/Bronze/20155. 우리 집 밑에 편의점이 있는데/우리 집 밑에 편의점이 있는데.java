import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int M = sc.nextInt();
        
        int[] countBrands = new int[M + 1];
        
        for (int i = 0; i < N; i++) {
            int brand = sc.nextInt();
            countBrands[brand]++;
        }
        
        int maxCount = 0;
        for (int i = 1; i <= M; i++) {
            maxCount = Math.max(maxCount, countBrands[i]);
        }
        
        System.out.println(maxCount);
    }
}