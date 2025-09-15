import java.util.*;
import java.io.*;

public class Main {
    public static void main (String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int t = Integer.parseInt(br.readLine());
        
        for (int i = 0; i < t; i++) {
            String p = br.readLine();
            
            System.out.println(isVps(p));
        }
    }
    
    private static String isVps(String p) {
        Stack<Integer> stack = new Stack<>();
        
        int count = 0;
        for (int i = 0; i < p.length(); i++) {
            char c = p.charAt(i);
            
            if (c == '(') {
                stack.add(i);
                count++;
            } else if (c == ')') {
                if (!stack.isEmpty()) {
                    stack.pop();
                }
                count--;
            }
            
            if (count < 0) {
                return "NO";
            }
        }
        
        if (count == 0) {
            return "YES";
        } else {
            return "NO";
        }
    }
}