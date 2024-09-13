class Solution {
    public long solution(int a, int b) {
        long sum = 0;
        
        long start = Math.min(a, b);
        long end = Math.max(a, b);
        for (long i = start; i <= end; i++) {
            sum += i;
        }
        if (start == end) return a;
        return sum;
    }
}