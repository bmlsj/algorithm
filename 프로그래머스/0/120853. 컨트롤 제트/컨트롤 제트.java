import java.util.*;
class Solution {
    public int solution(String s) {
        int answer = 0;
        String[] ss = s.split(" ");
        boolean check = false;
        for(int i = ss.length - 1; i >= 0; i--) {
            
            if (check) {
                check = false;
                continue;
            }
            
            if (ss[i].equals("Z")) {
                check = true;
            } else {
                answer += Integer.parseInt(ss[i]);
            }
        }
        
        return answer;
    }
}