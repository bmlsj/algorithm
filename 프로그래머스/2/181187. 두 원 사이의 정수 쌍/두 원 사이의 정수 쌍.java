import java.util.*;
class Solution {

    public long solution(int r1, int r2) {
        long answer = 0;
        
         for (int x = 1; x <= r2; x++) {
            // 바깥 원(r2)에서 가능한 최대 y
            long maxY = (long) Math.floor(Math.sqrt((long) r2 * r2 - (long) x * x));
            
            // 안쪽 원(r1) 안쪽의 y 경계
            long minY = (long) Math.ceil(Math.sqrt(Math.max(0, (long) r1 * r1 - (long) x * x)));
            
            // 각 x에서 가능한 y 개수 더하기
            answer += (maxY - minY + 1);
        }
        
        return answer * 4;
    }
}