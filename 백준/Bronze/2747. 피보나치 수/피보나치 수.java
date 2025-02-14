import java.util.*;

public class Main {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        
        int n = scanner.nextInt();
        
        int[] fiboArr = new int[n + 1];
        fiboArr[0] = 0;
        fiboArr[1] = 1;
        
        for (int i = 2; i <= fiboArr.length - 1; i++) {
            fiboArr[i] = fiboArr[i - 1] + fiboArr[i - 2];
        }
        
        System.out.println(fiboArr[n]);
    }
}