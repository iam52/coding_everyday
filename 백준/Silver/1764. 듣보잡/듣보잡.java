import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        Set<String> unheardSet = new HashSet<>();
        for (int i = 0; i < n; i++) {
            String unheard = br.readLine();
            unheardSet.add(unheard);
        }

        int count = 0;
        List<String> result = new ArrayList<>();
        for (int i = 0; i < m; i++) {
            String unseen = br.readLine();

            if (unheardSet.contains(unseen)) {
                count++;
                result.add(unseen);
            }
        }

        result.sort((a, b) -> a.compareTo(b));

        System.out.println(count);

        for (String unheardAndUnseen : result) {
            System.out.println(unheardAndUnseen);
        }
    }
}