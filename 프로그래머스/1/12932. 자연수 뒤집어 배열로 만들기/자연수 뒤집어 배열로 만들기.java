import java.util.*;

class Solution {
    public int[] solution(long n) {
        List<Integer> resultList = new ArrayList<>();
        String nStr = Long.toString(n);
        for (int i = nStr.length() - 1; i >= 0; i--) {
            resultList.add(nStr.charAt(i) - '0');
        }
        
        int[] resultArray = new int[resultList.size()];
        for (int i = 0; i < resultList.size(); i++) {
            resultArray[i] = resultList.get(i);
        }
        return resultArray;
    }
}