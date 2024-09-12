class Solution {
    public int solution(int[] diffs, int[] times, long limit) {
        
        long minLevel = 1;
        long maxLevel = limit;
        
        while (minLevel < maxLevel) {
            long mid = minLevel + (maxLevel - minLevel) / 2;
            
            if (isImpossible(diffs, times, mid, limit)) {
                minLevel = mid + 1;
            } else {
                maxLevel = mid;
            }
        }
        return (int) minLevel;
    }
    
    private static boolean isImpossible(int[] diffs, int[] times, long level, long limit) {
        
        long tmp = (long) times[0];
        
        for (int i = 1; i < diffs.length; i++) {
            if (diffs[i] > level) {
                tmp += (diffs[i] - level) * (times[i-1] + times[i]);
            }
            tmp += times[i];
        }
        return limit < tmp;
    }
}