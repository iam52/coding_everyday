class Solution {
    public boolean solution(int x) {
        
        String[] strX = String.valueOf(x).split("");
        
        int sum = 0;
        for (String sx : strX) {
            sum += Integer.parseInt(sx);
        }
        if (x % sum == 0) {
            return true;
        } else {
            return false;
        }
    }
}