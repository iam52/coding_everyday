import java.util.ArrayList;

class Solution {
    public int solution(int cacheSize, String[] cities) {
        int answer = 0;
        int cacheHit = 1;
        int cacheMiss = 5;
        
        ArrayList<String> cache = new ArrayList<>();
        
        for (String city : cities) {
            city = city.toLowerCase();
            
            if (cache.contains(city)) {
                answer += cacheHit;
                cache.remove(city);
                cache.add(city);
            } else {
                answer += cacheMiss;
                if (cacheSize > 0 && cache.size() >= cacheSize) {
                    cache.remove(0);
                }
                if (cacheSize > 0) {
                    cache.add(city);
                }
            }
        }
        return answer;
    }
}