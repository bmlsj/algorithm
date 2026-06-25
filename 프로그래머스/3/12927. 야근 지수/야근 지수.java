import java.util.*;
class Solution {
    public long solution(int n, int[] works) {
        long answer = 0;
        
        // N시간 동안 야근 피로도를 최소화
        // 1시간 동안 1처리 가능
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        for(int work: works) {
            pq.offer(work);
        }
        
        while(n > 0) {
            
            n--;
            int num = pq.peek();
            if (num >= 1) {
                int work = pq.poll() - 1;
                pq.offer(work);      
            }     
            
        }
        // System.out.println(pq);
        while(!pq.isEmpty()) {
            int num = pq.poll();
            answer += num * num;
        }
        
        return answer;
    }
}