class Solution {
    public int[] solution(int[] num_list, int n) {
        int[] result = new int[num_list.length];

        int firstIndex = 0;
        for (int i = n; i < num_list.length; i++) {
            result[firstIndex++] = num_list[i];
        }

        int secondIndex = num_list.length - n;
        for (int i = 0; i < n; i++) {
            result[secondIndex++] = num_list[i];
        }

        return result;
    }
}