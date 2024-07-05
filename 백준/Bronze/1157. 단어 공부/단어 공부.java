import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        String word = sc.nextLine().toUpperCase();
        
        int[] countAlphabet = new int[26];
        for (char ch : word.toCharArray()) {
            countAlphabet[ch - 'A']++;
        }
        
        int max = 0;
        char result = '?';
        
        for (int i = 0; i < countAlphabet.length; i++) {
            if (countAlphabet[i] > max) {
                max = countAlphabet[i];
                result = (char) (i + 'A');
            } else if (countAlphabet[i] == max) {
                result = '?';
            }
        }
        System.out.println(result);
    }
}