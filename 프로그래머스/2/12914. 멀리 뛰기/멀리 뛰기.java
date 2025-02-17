import java.util.*;

class Solution {
    public long solution(int n) {
        
        if (n <= 2) return n;
        
        long[] fiboArr = new long[n + 1];
        fiboArr[1] = 1;
        fiboArr[2] = 2;
        
        for (int i = 3; i <= fiboArr.length - 1; i++) {
            fiboArr[i] = (fiboArr[i - 1] + fiboArr[i - 2]) % 1234567;
        }
        
        return fiboArr[n];
    }
}