import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        int[] nums = new int[n];
        Set<Integer> deduplicate = new HashSet<>();
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            nums[i] = Integer.parseInt(st.nextToken());
            deduplicate.add(nums[i]);
        }

        List<Integer> sortedList = new ArrayList<>(deduplicate);
        Collections.sort(sortedList);

        Map<Integer, Integer> rankMap = new HashMap<>();
        for (int i = 0; i < sortedList.size(); i++) {
            rankMap.put(sortedList.get(i), i);
        }

        StringBuilder sb = new StringBuilder();
        for (int num : nums) {
            sb.append(rankMap.get(num)).append(' ');
        }

        System.out.println(sb);
    }
}