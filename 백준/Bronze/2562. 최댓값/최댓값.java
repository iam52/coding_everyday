import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        int[] nums = new int[9];
        int max = sc.nextInt();
        int idx = 0;
        
        for (int i = 1; i < nums.length; i++) {
            nums[i] = sc.nextInt();
            
            if (nums[i] > max) {
                max = nums[i];
                idx = i;
            }
        }
        System.out.println(max);
        System.out.println(idx + 1);
    }
}