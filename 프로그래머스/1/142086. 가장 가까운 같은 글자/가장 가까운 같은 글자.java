import java.util.*;
class Solution {
    public int[] solution(String s) {
        int[] answer = new int[s.length()];
        int[] seen = new int[128];
        Arrays.fill(seen, -1);
        
        for (int i = 0; i < s.length(); i++){
            char curr = s.charAt(i);
            int lastIndex = seen[curr];  // 현재 문자가 seen에 없으면 -1, 있으면 가장 최근 인덱스 값
            
            if (lastIndex == -1) {  // -1 이면, 문자가 처음만나므로 -1 넣음
                answer[i] = -1;
            } else {
                answer[i] = i - lastIndex;
            }
            seen[curr] = i;   
        }
        
        return answer;
    }
}