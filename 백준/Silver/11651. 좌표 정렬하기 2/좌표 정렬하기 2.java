import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int n = Integer.parseInt(br.readLine());
        
        List<int[]> points = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());
            
            points.add(new int[] {x, y});
        }
        
        points.sort(new Comparator<int[]>() {
            @Override
            public int compare(int[] a, int[] b) {
                if (a[1] == b[1]) {
                    return a[0] - b[0];
                }
                
                return a[1] - b[1];
            }
        });
        
        for (int[] point : points) {
            System.out.println(point[0] + " " + point[1]);
        }
    }
}
