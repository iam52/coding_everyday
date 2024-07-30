class Solution {
    public int solution(int n, int m, int[] section) {
        
        boolean[] wall = new boolean[n + 1];
        int roller = 0;
        
        for (int spot : section) {
            wall[spot] = true;
        }
        
        for (int i = 1; i <= n; i++) {
            if (wall[i]) {
                roller++;
                i += m - 1;
            }
        }
        return roller;
    }
}