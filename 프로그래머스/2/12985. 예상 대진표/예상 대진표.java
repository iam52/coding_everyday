class Solution
{
    public int solution(int n, int a, int b) {
        
        int answer = 0;
        
        for (int i = 0; i < n; i++) {
            int group1 = (int) ((a - 1) / Math.pow(2, i));
            int group2 = (int) ((b - 1) / Math.pow(2, i));
            
            if (group1 == group2) {
                break;
            }
            
            answer++;
        }
        
        return answer;
    }
}