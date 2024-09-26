class Solution {
    public int solution(int[] numbers) {
        int answer = 0;
        int nums = 45;
        
        for (int num : numbers) {
            answer += num;
        }
        return nums - answer;
    }
}