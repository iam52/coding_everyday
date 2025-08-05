import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int[] sides = new int[3];

        StringTokenizer st = new StringTokenizer(br.readLine());
        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        int c = Integer.parseInt(st.nextToken());

        sides[0] = a;
        sides[1] = b;
        sides[2] = c;

        Arrays.sort(sides);
        
        System.out.println(sides[0] + sides[1] + Math.min(sides[2], sides[0] + sides[1] - 1));
    }
}
