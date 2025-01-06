class Solution {
    public int solution(int[] dot) {
        int answer = 0;
        int xElement = dot[0];
        int yElement = dot[1];
        
        if (xElement > 0) {
            answer = yElement > 0 ? 1 : 4;
        } else if (xElement < 0) {
            answer = yElement > 0 ? 2 : 3;
        }
        return answer;
    }
}