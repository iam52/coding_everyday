import java.util.*;

class Solution {
    public int[] solution(int[] numbers) {
        
        Set<Integer> set = new HashSet<>();
        
        for (int i = 0; i < numbers.length; i++) {
            for (int j = i + 1; j < numbers.length; j++) {
                set.add(numbers[i] + numbers[j]);
            }
        }
        
        List<Integer> sortedList = new ArrayList<>(set);
        Collections.sort(sortedList);
        
        int[] result = new int[set.size()];
        
        for (int i = 0; i < result.length; i++) {
            result[i] = sortedList.get(i);
        }
        
        return result;
    }
}