import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int t = Integer.parseInt(br.readLine());

        for (int i = 0; i < t; i++) {
            String word = br.readLine();

            count = 0;
            while (true) {
                if (isPalindrome(word) == 1) {
                    System.out.println(1 + " " + count);
                    break;
                } else {
                    System.out.println(0 + " " + count);
                    break;
                }
            }
        }

    }

    static int count = 0;
    public static int recursion(String s, int left, int right) {
        count++;
        if (left >= right) return 1;
        else if (s.charAt(left) != s.charAt(right)) return 0;
        else return recursion(s, left + 1, right - 1);
    }

    public static int isPalindrome(String s) {
        return recursion(s, 0, s.length() - 1);
    }
}