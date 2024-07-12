import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        
        int pointsOnSide = 2;
        for (int i = 0; i < N; i++) {
            pointsOnSide = 2 * pointsOnSide - 1;
        }
        
        int totalPoints = pointsOnSide * pointsOnSide;
        System.out.println(totalPoints);
    }
}