import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int n = Integer.parseInt(br.readLine());
        
        Set<String> nSet = new HashSet<>(n);
        
        StringTokenizer st = new StringTokenizer(br.readLine());
        while (st.hasMoreTokens()) {
            nSet.add(st.nextToken());
        }
        
        int m = Integer.parseInt(br.readLine());
        
        st = new StringTokenizer(br.readLine());
        
        StringBuilder sb = new StringBuilder();
        
        while (st.hasMoreTokens()) {
            String num = st.nextToken();
            sb.append(nSet.contains(num) ? 1 : 0).append("\n");
        }
        
        System.out.print(sb);
    }
}