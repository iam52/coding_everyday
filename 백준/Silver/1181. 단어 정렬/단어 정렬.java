import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int n = Integer.parseInt(br.readLine());
        
        Set<String> alphs = new HashSet<>();
        
        for (int i = 0; i < n; i++) {
            alphs.add(br.readLine());
        }
        
        List<String> toList = new ArrayList<>(alphs);
        
        toList.sort((a, b) -> {
            if (a.length() != b.length()) {
                return a.length() - b.length();
            } else {
                return a.compareTo(b);
            }
        });
        
        StringBuilder result = new StringBuilder();
        for (String word : toList) {
            result.append(word).append("\n");
        }
        
        System.out.println(result);
    }
}