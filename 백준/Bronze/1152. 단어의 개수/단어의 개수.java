import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        
        int wordCount = 0;
        boolean inWord = false;
        
        for (int i = 0; i < input.length(); i++) {
            if (input.charAt(i) != ' ') {
                if (!inWord) {
                    wordCount++;
                    inWord = true;
                }
            } else {
                inWord = false;
            }
        }
        System.out.println(wordCount);
    }
}