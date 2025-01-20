import java.util.*;

public class Main {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        
        List<Integer> listA = new ArrayList<>();
        List<Integer> listB = new ArrayList<>();
        
        while (a > 0) {
            listA.add(a % 2);
            a /= 2;
        }
        Collections.reverse(listA);
        
        while (b > 0) {
            listB.add(b % 2);
            b /= 2;
        }
        Collections.reverse(listB);
        
        List<Integer> result = new ArrayList<>();
        
        int difference = Math.abs(listA.size() - listB.size());
        
        if (listA.size() < listB.size()) {
            for (int i = 0; i < difference; i++) {
                listA.add(0, 0);
            }
        } else if (listA.size() > listB.size()) {
            for (int i = 0; i < difference; i++) {
                listB.add(0, 0);
            }
        }
        
        for (int i = 0; i < listA.size(); i++) {
            result.add(listA.get(i) ^ listB.get(i));
        }
        
        Collections.reverse(result);
        
        int answer = 0;
        
        for (int i = 0; i < result.size(); i++) {
            answer += result.get(i) * Math.pow(2, i);
        }
        
        System.out.println(answer);
    }
}