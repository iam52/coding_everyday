import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        String word = scanner.nextLine();
        
        String reversedWord = new StringBuilder(word).reverse().toString();
        
        if (word.equals(reversedWord)) {
            System.out.println(1);
        } else {
            System.out.println(0);
        }
    }
}