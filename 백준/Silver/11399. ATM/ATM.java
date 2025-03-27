import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        Map<Integer, Integer> map = new HashMap<>();
        
        for (int i = 0; i < n; i++)  {
            map.put(i, sc.nextInt());
        }
        
        List<Map.Entry<Integer, Integer>> mapList = new LinkedList<>(map.entrySet());
        
        mapList.sort(Map.Entry.comparingByValue());
        
        int sum = 0;
        for (int i = 0; i < mapList.size(); i++) {
            for (int j = 0; j < i + 1; j++) {
                sum += mapList.get(j).getValue();
            }
        }
        
        System.out.println(sum);
    }
}