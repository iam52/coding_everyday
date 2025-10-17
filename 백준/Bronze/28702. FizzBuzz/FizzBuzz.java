import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String str1 = br.readLine();
        String str2 = br.readLine();
        String str3 = br.readLine();

        int num1, num2, num3 = 0;

        if (isInt(str1)) {
            num1 = Integer.parseInt(str1);
            num2 = num1 + 1;
            num3 = num2 + 1;
        } else if (isInt(str2)) {
            num2 = Integer.parseInt(str2);
            num1 = num2 - 1;
            num3 = num2 + 1;
        } else if (isInt(str3)) {
            num3 = Integer.parseInt(str3);
            num1 = num3 - 2;
            num2 = num3 - 1;
        }

        int answer = num3 + 1;

        System.out.println(isFizzBuzz(answer));

    }

    private static boolean isInt(String string) {
        try {
            Integer.parseInt(string);
            return true;
        } catch (NumberFormatException exception) {
            return false;
        }
    }

    private static String isFizzBuzz(int num) {
        if (num % 3 == 0 && num % 5 == 0) {
            return "FizzBuzz";
        } else if (num % 3 == 0) {
            return "Fizz";
        } else if (num % 5 == 0) {
            return "Buzz";
        }

        return String.valueOf(num);
    }
}