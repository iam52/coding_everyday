import java.util.*;

public class Main {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        
        int t = scanner.nextInt();
        
        int[] answers = new int[t];
        
        for (int i = 0; i < t; i++) {
            int k = scanner.nextInt();
            int n = scanner.nextInt();
            
            int[] people = new int[n];
            
            // 0층 초기화
            for (int j = 0; j < n; j++) {
                people[j] = j + 1;
            }
            
            // 1층부터 k층까지 계산
            for (int j = 0; j < k; j++) {
                for (int l = 1; l < n; l++) {
                    people[l] += people[l - 1];
                }
            }
            
            answers[i] = people[n - 1];
        }
        
        for (int answer : answers) {
            System.out.println(answer);
        }
    }
}