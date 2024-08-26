import java.util.*;

class Solution {
    public int solution(int m, int n, String[] board) {
        char[][] map = new char[m][n];
        for (int i = 0; i < m; i++) {
            map[i] = board[i].toCharArray();
        }
        
        int answer = 0;
        boolean hasMatched;
        
        do {
            hasMatched = false;
            boolean[][] willRemove = new boolean[m][n];
            
            // 1. 2x2 블록 찾기
            // CCBDE
            // AAADE
            // AAABF
            // CCBBF
            for (int i = 0; i < m - 1; i++) {
                for (int j = 0; j < n - 1; j++) {
                    if (map[i][j] != ' ' && 
                        map[i][j] == map[i][j+1] && 
                        map[i][j] == map[i+1][j] && 
                        map[i][j] == map[i+1][j+1]) {
                        willRemove[i][j] = true;
                        willRemove[i][j+1] = true;
                        willRemove[i+1][j] = true;
                        willRemove[i+1][j+1] = true;
                        hasMatched = true;
                    }
                }
            }
            
            // 2. 블록 제거 및 카운트
            for (int i = 0; i < m; i++) {
                for (int j = 0; j < n; j++) {
                    if (willRemove[i][j]) {
                        map[i][j] = ' ';
                        answer++;
                    }
                }
            }
            
            // 3. 블록 아래로 떨어뜨리기
            for (int j = 0; j < n; j++) {
                List<Character> column = new ArrayList<>();
                for (int i = m - 1; i >= 0; i--) {
                    if (map[i][j] != ' ') {
                        column.add(map[i][j]);
                    }
                }
                for (int i = m - 1; i >= 0; i--) {
                    if (i >= m - column.size()) {
                        map[i][j] = column.get(m - 1 - i);
                    } else {
                        map[i][j] = ' ';
                    }
                }
            }
            
        } while (hasMatched);
        
        return answer;
    }
}