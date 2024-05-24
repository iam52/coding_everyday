class Solution {
    public String[] solution(String[] strArr) {
        return java.util.Arrays.stream(strArr).filter(s -> !s.contains("ad")).toArray(String[]::new);
    }
}