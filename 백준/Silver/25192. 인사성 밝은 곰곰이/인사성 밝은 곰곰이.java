import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        Set<String> set = new HashSet<>();

        int count = 0;
        for (int i = 0; i < n; i++) {
            String member = br.readLine();

            if (member.equals("ENTER")) {
                count += set.size();
                set.clear();
            } else {
                set.add(member);
            }
        }

        count += set.size();
        System.out.println(count);
    }
}