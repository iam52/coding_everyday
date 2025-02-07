class Solution
{
    public int solution(int n, int a, int b)
    {
        int answer = 0;
        
        for (int i = 1; i <= n; i++) {
            if ((int) ((a-1) / Math.pow(2, i)) == (int) ((b-1) / Math.pow(2, i))) {
                answer = i;
                break;
            }
        }

        return answer;
    }
}