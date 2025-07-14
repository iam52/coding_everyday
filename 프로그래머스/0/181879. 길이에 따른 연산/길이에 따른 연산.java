class Solution {
    public int solution(int[] num_list) {
        int sum = 0;
        int multi = 1;
        for (int num : num_list) {
            sum += num;
            multi *= num;
        }
        
        return num_list.length >= 11 ? sum : multi;
    }
}