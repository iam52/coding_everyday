class Solution {
    public int[] solution(int[] lottos, int[] win_nums) {
        int maxCount = 0;
        int unknownCount = 0;
        
        for (int lotto : lottos) {
            if (lotto == 0) {
                unknownCount++;
                continue;
            }
            for (int win : win_nums) {
                if (win == lotto) {
                    maxCount++;
                    break;
                }
            }
        }
        
        int highRank = getRank(maxCount + unknownCount);
        int minRank = getRank(maxCount);
        
        return new int[] {highRank, minRank};
    }
    
    public int getRank(int score) {
        return switch (score) {
                case 6 -> 1;
                case 5 -> 2;
                case 4 -> 3;
                case 3 -> 4;
                case 2 -> 5;
                default -> 6;
        };
    }
}