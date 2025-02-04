import java.util.*;

class Solution {
    public int solution(int[] nums) {
        
        HashSet<Integer> myMon = new HashSet<>();
        
        for (int num : nums) {
            myMon.add(num);
        }
        
        return Math.min(myMon.size(), nums.length / 2);
    }
}