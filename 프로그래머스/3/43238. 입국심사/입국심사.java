class Solution {
    public long solution(int n, int[] times) {
        long left = 0;
        long right = (long) times[0] * n;
        long answer = right;
        
        while (left <= right) {
            long mid = (left + right) / 2;
            long people = 0;
            
            for (int time : times)             {
                people += mid / time;
            }
            
            if (people >= n) {
                answer = Math.min(answer, mid);
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }
        return answer;
    }
}