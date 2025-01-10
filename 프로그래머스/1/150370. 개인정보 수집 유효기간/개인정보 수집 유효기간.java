import java.util.*;
class Solution {
    public int[] solution(String today, String[] terms, String[] privacies) {
        
        String todayYear = today.split("\\.")[0];
        String todayMonth = today.split("\\.")[1];
        String todayDay = today.split("\\.")[2];
        
        Map<String, String> termsMap = new HashMap<>();
        for (int i = 0; i < terms.length; i++) {
            String term = terms[i];
            String[] parts = term.split(" ");
            termsMap.put(parts[0], parts[1]);
        }
        
        List<Integer> expiredIndexes = new ArrayList<>();
        
        for (int i = 0; i < privacies.length; i++) {
            String[] parts = privacies[i].split(" ");
            String date = parts[0];
            String type = parts[1];
            
            int validMonths = Integer.parseInt(termsMap.get(type));
            String[] dateParts = date.split("\\.");
            int month = Integer.parseInt(dateParts[1]) + validMonths;
            
            int year = Integer.parseInt(dateParts[0]);
            if (month > 12) {
                year += (month - 1) / 12;
                month = ((month - 1) % 12) + 1;
            }
            
            if (year < Integer.parseInt(todayYear)) {
                expiredIndexes.add(i + 1);
            } else if (year == Integer.parseInt(todayYear))
                if (month < Integer.parseInt(todayMonth)) {
                    expiredIndexes.add(i + 1);
                } else if (month == Integer.parseInt(todayMonth)) {
                    if (Integer.parseInt(dateParts[2]) <= Integer.parseInt(todayDay)) {
                        expiredIndexes.add(i + 1);
                    }
                }
        }
        return expiredIndexes.stream().mapToInt(Integer::intValue).toArray();
    }
}