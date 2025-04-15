import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        
        int n = Integer.parseInt(st.nextToken());
        int kim = Integer.parseInt(st.nextToken());
        int yim = Integer.parseInt(st.nextToken());
        
        int round = 0;
        while (kim != yim) {
            kim = (kim + 1) / 2;
            yim = (yim + 1) / 2;
            round++;
        }
        
        System.out.println(round);
    }
}