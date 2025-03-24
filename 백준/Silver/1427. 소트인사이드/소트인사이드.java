import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        List<Character> list = new ArrayList<>();
        
        String toStr = String.valueOf(n);
        
        for (char c : toStr.toCharArray()) {
            list.add(c);
        }
        
        list.sort(Comparator.reverseOrder());
        
        StringBuilder sortedStr = new StringBuilder();
        
        for (char c : list) {
            sortedStr.append(c);
        }
        
        System.out.println(Integer.parseInt(sortedStr.toString()));
    }
}