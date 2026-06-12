import java.util.*;
class Solution {
    public int solution(String[] babbling) {
        int answer = 0;
        
        for(String bab: babbling) {
            
            if (bab.matches(".*(ayaaya|yeye|woowoo|mama).*")) {
                continue;
            }
            
            bab = bab.replaceAll("aya|ye|woo|ma", "");
            System.out.println(bab);
            if (bab.isEmpty()) {
                answer++;
            }
        }
        return answer;
    }
}