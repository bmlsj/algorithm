import java.util.*;

class Solution {
    public int solution(int[] scoville, int K) {
        int answer = 0;
        PriorityQueue<Integer> pq = new PriorityQueue<>((o1, o2) -> o1 - o2);
        
        for(int i = 0; i < scoville.length; i++) {
            pq.offer(scoville[i]);
        }
        
        int cnt = 0;
		while (pq.size() > 1) {
			int first = pq.poll();
            
            if (first >= K) {
                break;
            }
            
			int second = pq.poll();
			int sco = first + second * 2;
			pq.offer(sco);
			cnt++;

		}

		return pq.peek() >= K ? cnt : -1;
    }
}