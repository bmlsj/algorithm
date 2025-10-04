import java.util.*;
class Solution {
    public int[] solution(int[] prices) {
        int[] answer = new int[prices.length];
        Stack<Integer> s = new Stack<>();
        for (int i = 0; i < prices.length-1;i++){
            for (int j = i + 1; j < prices.length; j++){
                if (prices[i] <= prices[j]) {
                    s.add(prices[j]);
                } else {
                    s.add(prices[j]);
                    answer[i] = s.size() ;
                    s.clear();
                    break;
                }
                if (j == prices.length -1) {
                    answer[i] = s.size() ;
                    s.clear();
                }
            }
        }
        return answer;
    }
}