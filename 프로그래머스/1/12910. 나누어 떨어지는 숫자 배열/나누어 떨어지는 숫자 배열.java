import java.util.*;
class Solution {
    public int[] solution(int[] arr, int divisor) {
        int[] answer = {};
        for (int num : arr) {
            if (num % divisor == 0) {
                answer = Arrays.copyOf(answer, answer.length + 1);
                answer[answer.length - 1] = num;
            }
        }
        
        if (answer.length == 0) {
            return new int[]{-1};
        }
        
        Arrays.sort(answer);
        
        return answer;
    }
}