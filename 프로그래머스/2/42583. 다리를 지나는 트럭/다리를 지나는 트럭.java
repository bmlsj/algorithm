import java.util.*;

class Solution {
    public int solution(int bridge_length, int weight, int[] truck_weights) {
        Queue<Integer> bridge = new LinkedList<>(); // 다리 위 트럭 큐
        int time = 0;       // 경과 시간
        int currentWeight = 0; // 다리 위 트럭 총 무게
        int idx = 0;        // 다음 트럭 인덱스

        // 다리 길이만큼 0으로 초기화 (처음에는 다리가 비어있음)
        for (int i = 0; i < bridge_length; i++) {
            bridge.add(0);
        }

        while (!bridge.isEmpty()) {
            time++;
            int leftTruck = bridge.poll(); // 다리를 지난 트럭
            currentWeight -= leftTruck;    // 다리 위 무게 갱신

            // 다음 트럭 올라갈 수 있는지 체크
            if (idx < truck_weights.length) {
                if (currentWeight + truck_weights[idx] <= weight) {
                    bridge.add(truck_weights[idx]);
                    currentWeight += truck_weights[idx];
                    idx++;
                } else {
                    // 무게 초과하면 빈 공간(0) 추가
                    bridge.add(0);
                }
            }
        }

        return time;
    }
}
