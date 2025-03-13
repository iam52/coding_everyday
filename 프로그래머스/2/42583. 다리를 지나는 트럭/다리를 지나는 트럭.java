import java.util.*;

class Solution {
    public int solution(int bridge_length, int weight, int[] truck_weights) {
        Queue<Integer> bridge = new LinkedList<>();
        
        // 다리를 빈 공간으로 초기화
        for (int i = 0; i < bridge_length; i++) {
            bridge.add(0);
        }
        
        int time = 0;
        int currentWeight = 0;
        int truckIndex = 0;
        
        // 모든 트럭이 다리를 건널 때까지 반복
        while (truckIndex < truck_weights.length || currentWeight > 0) {
            // 시간 증가
            time++;
            
            // 다리 끝에 있는 트럭(또는 빈 공간)을 제거
            currentWeight -= bridge.poll();
            
            // 새 트럭이 다리에 진입할 수 있는지 확인
            if (truckIndex < truck_weights.length) {
                if (currentWeight + truck_weights[truckIndex] <= weight) {
                    // 새 트럭 진입
                    bridge.add(truck_weights[truckIndex]);
                    currentWeight += truck_weights[truckIndex];
                    truckIndex++;
                } else {
                    // 무게 초과로 빈 공간 추가
                    bridge.add(0);
                }
            } else {
                // 남은 트럭이 없으면 빈 공간 추가
                bridge.add(0);
            }
        }
        
        return time;
    }
}
