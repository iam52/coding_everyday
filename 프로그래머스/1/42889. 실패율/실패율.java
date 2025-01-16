import java.util.*;

class Solution {
    public int[] solution(int N, int[] stages) {
        // 1. 각 스테이지 별 도전자 수와 실패한 사용자 수 계산
        int[] challengers = new int[N + 2];
        int[] fails = new int[N + 2];
        
        // 각 플레이어가 도달한 스테이지 카운트
        for (int stage : stages) {
            fails[stage]++; // 현재 도전 중인 스테이지 실패자 증가
            for (int i = 1; i <= stage; i++) {
                challengers[i]++; // 도달한 스테이지까지 도전자 수 증가
            }
        }
        
        // 2. 실패율을 저장할 배열 생성
        double[] failRates = new double[N + 1];
        for (int i = 1; i <= N; i++) {
            // 도전자가 없으면 실패율 0
            if (challengers[i] == 0) {
                failRates[i] = 0;
            } else {
                failRates[i] = (double) fails[i] / challengers[i];
            }
        }
        
        // 3. 스테이지 번호를 담을 결과 배열 생성
        Integer[] result = new Integer[N];
        for (int i = 0; i < N; i++) {
            result[i] = i + 1;
        }
        
        // 4. 실패율 내림차순 정렬
        Arrays.sort(result, (a, b) -> {
            if (failRates[a] == failRates[b]) {
                return a - b; // 실패율이 같다면 스테이지 번호 오름차순
            }
            return failRates[b] > failRates[a] ? 1 : -1; // 실패율 내림차순
        });
        
        // 5. int[] 타입으로 변환하여 반환
        return Arrays.stream(result).mapToInt(Integer::intValue).toArray();
    }
}