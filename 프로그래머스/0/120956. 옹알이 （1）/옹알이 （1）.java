class Solution {
    public int solution(String[] babbling) {
        int answer = 0;
        
        for (String word : babbling) {
            word = word
                .replace("aya", " ")
                .replace("ye", " ")
                .replace("woo", " ")
                .replace("ma", "")
                .replace(" ", "");
            if (word.isEmpty()) answer++;
        }
        return answer;
    }
}