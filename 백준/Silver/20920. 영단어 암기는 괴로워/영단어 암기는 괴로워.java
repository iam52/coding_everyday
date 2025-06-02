import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        Map<String, Integer> dict = new HashMap<>();

        for (int i = 0; i < n; i++) {
            String word = br.readLine();

            if (word.length() >= m) {
                if (dict.containsKey(word)) {
                    dict.put(word, dict.get(word) + 10);
                } else {
                    dict.put(word, 1);
                }
            }
        }

        List<Map.Entry<String, Integer>> entryList = new ArrayList<>(dict.entrySet());

        Collections.sort(entryList, (e1, e2) -> {
            if (!e1.getValue().equals(e2.getValue())) {
                return e2.getValue() - e1.getValue();
            }

            if (e1.getKey().length() != e2.getKey().length()) {
                return e2.getKey().length() - e1.getKey().length();
            }

            return e1.getKey().compareTo(e2.getKey());
        });

        StringBuilder sb = new StringBuilder();
        for (Map.Entry<String, Integer> entry : entryList) {
            sb.append(entry.getKey()).append("\n");
        }

        System.out.println(sb);
    }
}