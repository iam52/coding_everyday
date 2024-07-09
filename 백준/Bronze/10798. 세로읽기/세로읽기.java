import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder result = new StringBuilder();
        
        String[] words = new String[5];
        for (int i = 0; i < 5; i++) {
            words[i] = sc.nextLine();
        }
        
        for (int col = 0; col < 15; col++) {
            for (int row = 0; row < 5; row++) {
                if (col < words[row].length()) {
                    result.append(words[row].charAt(col));
                }
            }
        }
        System.out.println(result);
    }
}