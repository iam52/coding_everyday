import java.util.Scanner;

public class Main {
    private static final int[] FULL_SET = {1, 1, 2, 2, 2, 8};
    
    public static void main(String[] args) {
        
        Scanner scanner  = new Scanner(System.in);
        StringBuilder result = new StringBuilder();
        
        for (int piece : FULL_SET) {
            result.append(piece - scanner.nextInt()).append(" ");
        }
        
        System.out.println(result);
    }
}