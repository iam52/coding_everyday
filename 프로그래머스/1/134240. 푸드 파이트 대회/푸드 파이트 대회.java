class Solution {
    public String solution(int[] food) {
        StringBuilder stringBuilder = new StringBuilder();
        
        for (int i = 1; i <= food.length - 1; i++) {
            int cnt = food[i] / 2;
            for (int j = 0; j < cnt; j++) {
                stringBuilder.append(i);
            }
        }
        
        stringBuilder.append(0);

        for (int i = food.length - 1; i > 0; i--) {
            int cnt = food[i] / 2;
            for (int j = 0; j < cnt; j++) {
                stringBuilder.append(i);
            }
        }
        return stringBuilder.toString();
    }
}