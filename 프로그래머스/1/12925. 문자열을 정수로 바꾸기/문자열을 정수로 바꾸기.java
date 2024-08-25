class Solution {
    public int solution(String s) {
        
        int result = 0;
        boolean isNegative = false;
        
        if (s.charAt(0) == '-') {
            isNegative = true;
            s = s.substring(1);
        } else if (s.charAt(0) == '+') {
            s = s.substring(1);
        }
        
        for (int i = 0; i < s.length(); i++) {
            char digit = s.charAt(i);
            int digitValue = digit - '0';
            result = result * 10 + digitValue;
        }
        
        if (isNegative) {
            result = -result;
        }
        return result;
    }
}