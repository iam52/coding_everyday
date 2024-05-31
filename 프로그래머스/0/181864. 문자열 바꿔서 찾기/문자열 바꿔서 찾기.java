class Solution {
    public int solution(String myString, String pat) {
        StringBuilder sb = new StringBuilder();
        for (char c : myString.toCharArray()) {
            sb.append(c == 'A' ? 'B' : 'A');
        }
        String newString = sb.toString();
        
        return newString.contains(pat) ? 1 : 0;
    }
}