import java.util.*;

public class Main {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        char[][] chessTable = new char[8][8];
        
        for (int i = 0; i < 8; i++) {
            String line = sc.nextLine();
            for (int j = 0; j < 8; j++) {
                chessTable[i][j] = line.charAt(j);
            }
        }
        
        int count = 0;
        
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                if (i % 2 == 0) {
                    if (j % 2 ==0 && chessTable[i][j] == 'F') {
                        count++;
                    }
                } else {
                    if (j % 2 !=0 && chessTable[i][j] == 'F') {
                        count++;
                    }
                }
            }
        }
        System.out.println(count);
    }
}