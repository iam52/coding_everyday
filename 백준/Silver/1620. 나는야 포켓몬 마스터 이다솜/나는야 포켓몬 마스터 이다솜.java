import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        List<String> idxToName = new ArrayList<>();
        Map<String, Integer> nameToIdx = new HashMap<>();

        for (int i = 1; i <= n; i++) {
            String name = br.readLine();
            idxToName.add(name);
            nameToIdx.put(name, i);
        }

        for (int i = 0; i < m; i++) {
            String quiz = br.readLine();
            try {
                int idx = Integer.parseInt(quiz);
                System.out.println(idxToName.get(idx - 1));
            } catch (NumberFormatException e) {
                System.out.println(nameToIdx.get(quiz));
            }
        }
    }
}
