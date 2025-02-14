import java.util.*;

class Solution {
    public int solution(int[] numbers) {
        
        Arrays.sort(numbers);
        
        int length = numbers.length;
        
        return Math.max(numbers[0] * numbers[1], numbers[length - 2] * numbers[length - 1]);
    }
}