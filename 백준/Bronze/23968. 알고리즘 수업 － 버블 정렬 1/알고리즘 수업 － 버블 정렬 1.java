import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        
        int[] a = new int[n];
        
        for (int i = 0; i < a.length; i++) {
            a[i] = sc.nextInt();
        }
        
        int count = 0;
        
        for (int i = 0; i < a.length - 1; i++) {
            for (int j = 1; j < a.length - i; j++) {
                if (a[j - 1] > a[j]) {
                    int temp = a[j - 1];
                    a[j - 1] = a[j];
                    a[j] = temp;
                    count++;
                    if (count == k) {
                        System.out.println(a[j - 1] + " " + a[j]);
                        break;
                    }
                }
            }
        }
        
        if (count < k) {
            System.out.println(-1);
        }
    }
}