import java.util.*;
class Solution {
    public int solution(int cacheSize, String[] cities) {

        Deque<String> deque = new ArrayDeque<>();
        int time = 0;
        if (cacheSize == 0) {
            return 5 * cities.length;        
        }
        
        for(int i = 0; i < cities.length; i++) {
            String city = cities[i].toUpperCase();
            
            if (deque.contains(city)) { // hit 경우
                deque.remove(city);
                deque.offer(city);
                time++;
            } else if (deque.size() < cacheSize) {  // miss 인데, cache크기보다 작을 때
                deque.offer(city);
                time += 5;
            } else {  // miss 인데, cache크기보다 클 때
                deque.pollFirst();
                deque.offer(city);
                time += 5;
            }
        }
        
        return time;
    }
}