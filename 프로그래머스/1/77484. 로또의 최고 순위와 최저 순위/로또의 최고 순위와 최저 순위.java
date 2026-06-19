import java.util.*;
class Solution {
    public int[] solution(int[] lottos, int[] win_nums) {
        int[] answer = new int[2];
        
        int cnt = 0;
        int zero = 0;
        for(int lotto: lottos) {
            if (lotto == 0) {
                zero++;
                continue;
            }
            
            for(int win: win_nums) {
                if (lotto == win) {
                    cnt++;
                    break;
                }
            }
        }
        
        // System.out.println(cnt + "," + zero);
        // System.out.println(7 - (cnt + zero)  + ", " + (7 - cnt));
        answer[0] = Math.min(7 - (cnt + zero), 6);
        answer[1] = Math.min(7 - cnt, 6);

        return answer;
    }
}