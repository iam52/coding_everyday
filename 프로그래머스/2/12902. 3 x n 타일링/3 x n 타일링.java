class Solution {
    public int solution(int n) {
        
        int mod = 1000000007;
        
        if (n % 2 != 0) return 0;
        
        long[] tile = new long[n+1];
        tile[0] = 1;
        tile[2] = 3;
        
        for (int i = 4; i <= n; i += 2) {
            tile[i] = tile[i-2] * 3;
            for (int j = i-4; j >= 0; j -= 2) {
                tile[i] += tile[j] * 2;
            }
            tile[i] %= mod;
        }
        return (int) tile[n];
    }
}