import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int n = Integer.parseInt(br.readLine());
        
        List<String[]> members = new ArrayList<>();
        
        for (int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            String age = st.nextToken();
            String name = st.nextToken();
            members.add(new String[] {age, name});
        }
        
        members.sort((a, b) -> Integer.parseInt(a[0]) - Integer.parseInt(b[0]));
        
        for (String[] member : members) {
            System.out.println(member[0] + " " + member[1]);
        }
    }
}