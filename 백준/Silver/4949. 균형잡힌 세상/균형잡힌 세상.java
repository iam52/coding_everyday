import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        while (true) {
            String input = br.readLine();
            
            if (input.equals(".")) break;
            
            Stack<Character> stack = new Stack<>();
            boolean balanced = true;

            for (char ch : input.toCharArray()) {
                if (ch == '.') break;
                
                if (ch == '(' || ch == '[') {
                    stack.push(ch);
                } else if (ch == ')') {
                    if (stack.isEmpty() || stack.pop() != '(') {
                        balanced = false;
                    }
                } else if (ch == ']') {
                    if (stack.isEmpty() || stack.pop() != '[') {
                        balanced = false;
                    }
                }
                
                if (!balanced) break;
            }
            
            if (balanced && stack.isEmpty()) {
                System.out.println("yes");
            } else {
                System.out.println("no");
            }
        }
    }
}