import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        List<Integer> list = new ArrayList<>();
        
        for (int i = 0; i < n; i++) {
            int num = sc.nextInt();
            list.add(num);
        }
        
        Collections.sort(list);
        
        for (int num : list) {
            System.out.println(num);
        }
    }
}