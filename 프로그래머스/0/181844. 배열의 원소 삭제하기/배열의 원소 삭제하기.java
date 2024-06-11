class Solution {
    public int[] solution(int[] arr, int[] delete_list) {
        int[] result = new int[arr.length];
        int idx = 0;
        
        for (int i = 0; i < arr.length; i++) {
            boolean isDeleted = false;
            
            for (int j = 0; j < delete_list.length; j++) {
                if (arr[i] == delete_list[j]) {
                    isDeleted = true;
                    break;
                }
            }
            
            if (!isDeleted) {
                result[idx++] = arr[i];
            }
        }
        
        int[] answer = new int[idx];
        for (int i = 0; i < idx; i++) {
            answer[i] = result[i];
        }
        return answer;
    }
}