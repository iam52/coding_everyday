import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        StringBuilder result = new StringBuilder();
        
        String word = scanner.nextLine();
        
        String reversedWord = String.valueOf(result.append(word).reverse());
        
        if (word.equals(reversedWord)) {
            System.out.println(1);
        } else {
            System.out.println(0);
        }
    }
}