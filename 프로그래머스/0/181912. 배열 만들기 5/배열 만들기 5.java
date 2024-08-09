import java.util.*;
class Solution {
    public int[] solution(String[] intStrs, int k, int s, int l) {
        
        Stack<Integer> st = new Stack<>();
        
        for (int i = 0; i < intStrs.length; i++){
            
            String sub = intStrs[i].substring(s, s+l);
            int num = Integer.parseInt(sub);
            if (num > k){
                st.add(num);
            } 
        }
        
        int[] answer = new int[st.size()];
        for (int i = 0; i < answer.length; i++){
            answer[i] = st.get(i);
        }
        return answer;
    }
}