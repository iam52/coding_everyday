import java.util.Arrays;
import java.util.ArrayList;
import java.util.List;

class Solution {
    public String[] solution(String my_string) {
        List<String> words = new ArrayList<>();
        StringBuilder word = new StringBuilder();
        
        for (int i=0; i<my_string.length(); i++) {
            char c = my_string.charAt(i);
            if (c != ' ') {
                word.append(c);
            } else if (word.length() > 0) {
                words.add(word.toString());
                word.setLength(0);
            }
        }
        
        if (word.length() > 0) {
            words.add(word.toString());
        }
        return words.toArray(new String[0]);
    }
}