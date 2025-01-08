import java.util.*;
class Solution {
    public int solution(String s) {
        
        Map<Integer, String> alphabets = new HashMap<>();
        alphabets.put(0, "zero");
        alphabets.put(1, "one");
        alphabets.put(2, "two");
        alphabets.put(3, "three");
        alphabets.put(4, "four");
        alphabets.put(5, "five");
        alphabets.put(6, "six");
        alphabets.put(7, "seven");
        alphabets.put(8, "eight");
        alphabets.put(9, "nine");
        
        StringBuilder current = new StringBuilder();
        StringBuilder result = new StringBuilder();
        
        for (int i = 0; i < s.length(); i++) {
            char character = s.charAt(i);
            
            if (Character.isDigit(character)) {
                result.append(character);
                continue;
            }
            
            current.append(character);
            for (Integer key : alphabets.keySet()) {
                if (alphabets.get(key).equals(current.toString())) {
                    result.append(key);
                    current.setLength(0);
                    break;
                }
            }
        }
        return Integer.parseInt(result.toString());
    }
}