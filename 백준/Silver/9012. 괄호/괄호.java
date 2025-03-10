import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();
        sc.nextLine();

        for (int i = 0; i < t; i++) {
            String p = sc.nextLine();
            System.out.println(matchingParis(p));
        }
    }

    public static String matchingParis(String s) {
        Stack<Integer> stack = new Stack<>();

        int answer = 0;

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);

            if (c == '(') {
                stack.push(i);
                answer++;
            } else if (c == ')') {
                if (!stack.isEmpty()) {
                    stack.pop();
                }
                answer--;
                if (answer < 0) return "NO";
            }
        }

        if (answer == 0) {
            return "YES";
        } else {
            return "NO";
        }
    }
}