import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        Set<String> dancingPeople = new HashSet<>();
        dancingPeople.add("ChongChong");

        for (int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            String encounterA = st.nextToken();
            String encounterB = st.nextToken();

            if (dancingPeople.contains(encounterA) || dancingPeople.contains(encounterB)) {
                dancingPeople.add(encounterA);
                dancingPeople.add(encounterB);
            }
        }

        System.out.println(dancingPeople.size());
    }
}
