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
        
        alphs.stream()
            .sorted((a, b) -> {
                int lenDiff = a.length() - b.length();
                return lenDiff != 0 ? lenDiff : a.compareTo(b);
            })
            .forEach(System.out::println);
    }
}