import java.util.Scanner;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int[] dice = new int[3];
        dice[0] = sc.nextInt();
        dice[1] = sc.nextInt();
        dice[2] = sc.nextInt();
        
        Arrays.sort(dice);
        
        int prize = 0;
        if (dice[0] == dice[1] && dice[1] == dice[2]) {
            prize = 10000 + (dice[0] * 1000);
        } else if (dice[0] == dice[1] || dice[1] == dice[2]) {
            prize = 1000 + (dice[1] * 100);
        } else {
            prize = dice[2] * 100;
        }
        
        
        System.out.println(prize);
    }
}