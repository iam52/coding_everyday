import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        List<Integer> list = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            list.add(Integer.parseInt(br.readLine()));
        }

        System.out.println(arithmeticMean(list));
        System.out.println(median(list));
        System.out.println(mode(list));
        System.out.println(scope(list));

    }

    public static int arithmeticMean(List<Integer> list) {
        int sum = 0;

        for (Integer integer : list) {
            sum += integer;
        }

        return Math.round((float) sum / list.size());
    }

    public static int median(List<Integer> list) {
        list.sort(Integer::compareTo);
        return list.get(list.size() / 2);
    }

    public static int mode(List<Integer> list) {
        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < list.size(); i++) {
            if (map.containsKey(list.get(i))) {
                map.put(list.get(i), map.get(list.get(i)) + 1);
            } else {
                map.put(list.get(i), 1);
            }
        }

        int maxFreq = Collections.max(map.values());

        List<Integer> modes = new ArrayList<>();
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if (entry.getValue() == maxFreq) {
                modes.add(entry.getKey());
            }
        }

        Collections.sort(modes);
        return (modes.size() > 1) ? modes.get(1) : modes.get(0);
    }

    public static int scope(List<Integer> list) {
        list.sort(Integer::compareTo);
        return list.get(list.size() - 1) - list.get(0);
    }
}