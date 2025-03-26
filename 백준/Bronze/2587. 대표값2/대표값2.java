import java.util.*;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        List<Integer> list = new ArrayList<>();

        for (int i = 0; i < 5; i++) {
            int n = sc.nextInt();
            list.add(n);
        }

        Collections.sort(list);

        int sum = 0;
        for (int i = 0; i < list.size(); i++) {
            sum += list.get(i);
        }
        System.out.println(sum / 5);

        int center = list.size() / 2;
        System.out.println(list.get(center));
    }
}