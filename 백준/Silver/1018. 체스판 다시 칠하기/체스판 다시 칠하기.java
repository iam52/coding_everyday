import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        
        char[][] chessTable = new char[n][m];
        
        for(int i = 0; i < n; i++) {
            String line = br.readLine();
            for (int j = 0; j < m; j++) {
                chessTable[i][j] = line.charAt(j);
            }
        }
        
        int min = Integer.MAX_VALUE;
        for (int i = 0; i <= n - 8; i++) {
            for (int j = 0; j <= m - 8; j++) {
                min = Math.min(min, fixedCount(chessTable, i, j));
            }
        }
        
        System.out.println(min);
    }
    
    private static int fixedCount(char[][] map, int x, int y) {
        int cntW = 0, cntB = 0;
        
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                if ((i + j) % 2 == 0) {
                    if (map[x + i][j + y] != 'W') cntW++;
                    if (map[x + i][j + y] != 'B') cntB++;
                } else {
                    if (map[x + i][j + y] != 'B') cntW++;
                    if (map[x + i][j + y] != 'W') cntB++;
                }
            }
        }
        
        return Math.min(cntW, cntB);
    }
}