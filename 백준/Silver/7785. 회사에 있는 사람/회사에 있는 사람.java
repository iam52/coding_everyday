import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int n = Integer.parseInt(br.readLine());
        
        Map<String, String> log = new HashMap<>();
        
        for (int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            String name = st.nextToken();
            String status = st.nextToken();
            log.put(name, status);
        }
        
        List<String> inOffice = new ArrayList<>();
        
        for (Map.Entry<String, String> entry : log.entrySet()) {
            if ("enter".equals(entry.getValue())) {
                inOffice.add(entry.getKey());
            }
        }
        
        inOffice.sort((a, b) -> b.compareTo(a));
        
        for (String name : inOffice) {
            System.out.println(name);
        }
    }
}
