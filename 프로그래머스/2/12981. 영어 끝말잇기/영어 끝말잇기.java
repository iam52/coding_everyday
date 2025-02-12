import java.util.*;

class Solution {
    public int[] solution(int n, String[] words) {
        
        Map<Integer, Integer> turns = new HashMap<>() ;
        Set<String> usedWords = new HashSet<>();
        
        for (int i = 0; i < words.length; i++) {
            int player = (i % n) + 1;
            int turn = turns.getOrDefault(player, 0) + 1;
            
            if (i > 0 &&
               (usedWords.contains(words[i]) ||
                words[i - 1].charAt(words[i - 1].length() - 1) !=
                words[i].charAt(0) ||
                words[i].length() == 1)
            ) {
               return new int[] {player, turn} ;
            }
            
            usedWords.add(words[i]);
            turns.put(player, turn);
        }
        
        return new int[] {0, 0};
        
    }
}