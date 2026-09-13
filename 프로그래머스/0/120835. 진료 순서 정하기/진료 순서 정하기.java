import java.util.*;
class Solution {
    public int[] solution(int[] emergency) {
        int[] answer = new int[emergency.length];
        int[] tmp = emergency.clone();
        int idx = 0;
        
        Arrays.sort(tmp);
        
        for(int i = 0; i < emergency.length; i++) {
            int emer = emergency[i];
            System.out.print(emer + ": ");
            
            for(int j = tmp.length - 1; j >= 0; j--) {
                if (emer == tmp[j]) {
                    answer[idx++] = emergency.length - j;
                    break;
                }
            }
        }
        
        return answer;
    }
}