import java.util.*;

public class Main {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();

        int stick = 64;
        int count = 0;

        while (x > 0) {
            if (stick <= x) {
                x -= stick;
                count++;
            }
            stick /= 2;
        }
        System.out.println(count);
	}
}