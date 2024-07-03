import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        String S = scanner.next();
        
        int[] positions = new int[26];
        for (int i = 0; i < positions.length; i++) {
            positions[i] = -1;
        }
        
        for (int i = 0; i < S.length(); i++) {
            char letter = S.charAt(i);
            int index = letter - 'a';
            
            if (positions[index] == -1) {
                positions[index] = i;
            }
        }
        for (int position : positions) {
            System.out.print(position + " ");
        }
    }
}