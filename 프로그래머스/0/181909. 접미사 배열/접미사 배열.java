import java.util.*;
class Solution {
    public String[] solution(String my_string) {
        
        int strLength = my_string.length();
        
        String[] result = new String[strLength];
        
        for (int i = 0; i < strLength; i++) {
            result[i] = my_string.substring(i);
        }
        
        Arrays.sort(result);
        
        return result;
    }
}