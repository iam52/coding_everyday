class Solution {
    public int solution(int n, int m, int[] section) {
        int roller = 0;
        int rollerPos = 0;
        
        for (int i = 0; i < section.length; i++) {
            if (section[i] > rollerPos) {
                roller++;
                rollerPos = section[i] + m - 1;
            }
        }
        return roller;
    }
}