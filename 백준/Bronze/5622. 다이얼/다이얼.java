import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String dialAlphabet = scanner.next();

        int dialTime = 0;
        for (char ch : dialAlphabet.toCharArray()) {
            if (ch >= 'A' && ch <= 'C') {
                dialTime += 3;
            } else if (ch <= 'F') {
                dialTime += 4;
            } else if (ch <= 'I') {
                dialTime += 5;
            } else if (ch <= 'L') {
                dialTime += 6;
            } else if (ch <= 'O') {
                dialTime += 7;
            } else if (ch <= 'S') {
                dialTime += 8;
            } else if (ch <= 'V') {
                dialTime += 9;
            } else if (ch <= 'Z') {
                dialTime += 10;
            } else {
                dialTime += 11;
            }
        }
        System.out.println(dialTime);
    }
}