import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(bufferedReader.readLine().trim());
        bufferedReader.close();
        
        System.out.println(findLastCard(n));
    }
    
    public static int findLastCard(int n) {
        Queue<Integer> cards = new LinkedList<>();
        
        for (int i = 1; i <= n; i++) {
            cards.offer(i);
        }
        
        while (cards.size() > 1) {
            cards.poll();
            cards.offer(cards.poll());
        }
        
        return cards.peek();
    }
}