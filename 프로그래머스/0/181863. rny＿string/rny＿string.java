class Solution {
    public String solution(String rny_string) {
        String answer = "";
     
        for (int i = 0; i<rny_string.length(); i++) {
            char cur_str = rny_string.charAt(i);
            
            if (cur_str == 'm') {
                answer += "rn";
            } else{
                answer += cur_str;
            }
        }
        return answer;
    }
}