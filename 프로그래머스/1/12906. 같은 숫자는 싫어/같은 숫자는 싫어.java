import java.util.ArrayList;
import java.util.Arrays;

public class Solution {
    public int[] solution(int []arr) {
        
        ArrayList<Integer> answer = new ArrayList<>();
        answer.add(arr[0]);

        for (int i = 1; i < arr.length; i++) {

            if (arr[i] != arr[i - 1]) {
                answer.add(arr[i]);
            }
        }

        int[] answerArr = new int[answer.size()];
        for (int i = 0; i < answerArr.length; i++) {
            answerArr[i] = answer.get(i);
        }

        return answerArr;
    }
}