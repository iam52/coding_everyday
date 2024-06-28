import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        
        int[] nums  = new int[N];
        for (int i = 0; i < N; i++) {
            nums[i] = sc.nextInt();
        }
        
        int v = sc.nextInt();
        
        int cnt = 0;
        for (int i = 0; i < N; i++) {
            if (v == nums[i]) {
                cnt++;
            }
        }
        System.out.println(cnt);
    }
}