import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String S = sc.nextLine();
        
        System.out.println(matchingPairs(S));
    }
    
    public static int matchingPairs(String S) {
        int starIndex = S.indexOf('*');
        
        Stack<Integer> leftSide = new Stack<>();
        for (int i = 0; i < starIndex; i++) {
            char c = S.charAt(i);
            if (c == '(') {
                leftSide.push(i);
            } else if (c == ')') {
                leftSide.pop();
            }
        }
        
        Stack<Integer> rightSide = new Stack<>();
        for (int i = S.length() - 1; i > starIndex; i--) {
            char c = S.charAt(i);
            if (c == ')') {
                rightSide.push(i);
            } else if (c == '(') {
                rightSide.pop();
            }
        }
        
        return Math.min(leftSide.size(), rightSide.size());
                
    }
}