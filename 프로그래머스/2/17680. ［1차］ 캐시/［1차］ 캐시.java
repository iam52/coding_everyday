import java.util.*;

class Solution {
    public int solution(int cacheSize, String[] cities) {
        
        int time = 0;
        String[] inCache = new String[cacheSize];
        
        for (int i = 0; i < cities.length; i++) {
            
            cities[i] = cities[i].toUpperCase();
            
            if (cacheSize == 0) {
                time = cities.length * 5;
            } else if (!isContains(inCache, cities[i])) {
                time += 5;
                updateCache(inCache, cities[i]);
            } else {
                time++;
                updateHitCache(inCache, cities[i]);
            }
        }
        
        return time;
    }
    
    private static boolean isContains(String[] caches, String value) {
        value.toLowerCase();
        for (String cache : caches) {
            if (value.equals(cache)) {
                
                return true;
            }
        }
        
        return false;
    }
    
    private static void updateCache(String[] currentCache, String city) {
        for (int i = currentCache.length - 1; i > 0; i--) {
            currentCache[i] = currentCache[i - 1];
        }
        
        currentCache[0] = city;
    }
    
    private static void updateHitCache(String[] currentCache, String value) {
        int hitIndex = -1;
        
        for (int i = 0; i < currentCache.length; i++) {
            if (value.equals(currentCache[i])) {
                hitIndex = i;
                break;
            }
        }
        
        String temp = currentCache[hitIndex];
        for (int i = hitIndex; i > 0; i--) {
            currentCache[i] = currentCache[i - 1];
        }
        
        currentCache[0] = temp;
    }
}