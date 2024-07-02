import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        
        StringTokenizer st = new StringTokenizer(br.readLine());
        
        int max = 0;
        int sum = 0;
        
        for (int i = 0; i < N; i++) {
            int scores = Integer.parseInt(st.nextToken());
            
            if (scores > max) {
                max = scores;
            }
            sum += scores;
        }
        System.out.println(sum * 100.0 / max / N);
    }
}