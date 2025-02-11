import java.util.*;

public class Main {
    
    static int[][] board = new int[5][5];
    static Set<String> uniqueNums = new HashSet<>();
    static int[] dx = {-1, 1, 0, 0};
    static int[] dy = {0, 0, -1, 1};
    
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board.length; j++) {
                board[i][j] = scanner.nextInt();
            }
        }
        
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board.length; j++) {
                dfs(i, j, 0, "");
            }
        }
        
        System.out.println(uniqueNums.size());
    }
    
    static void dfs(int x, int y, int depth, String num) {
        if (depth == 6) {
            uniqueNums.add(num);
            return;
        }
        
        num += board[x][y];
        
        for (int i = 0; i < 4; i++) {
            int newX = x + dx[i];
            int newY = y + dy[i];
            
            if (newX >=0 && newX < 5 && newY >= 0 && newY < 5) {
                dfs(newX, newY, depth + 1, num);
            }
        }
    }
}