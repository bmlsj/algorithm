import java.util.*;

public class Solution {
    public int[] solution(int []arr) {
        
        List<Integer> ans = new ArrayList<>();
        
        int tmp = arr[0];
        ans.add(arr[0]);
        
        for(int i = 1; i < arr.length; i++) {
            if (tmp != arr[i]) {
                ans.add(arr[i]);
                tmp = arr[i];
            } 
        }
        
        int[] answer = new int[ans.size()];
        for(int i = 0; i < ans.size(); i++) {
            answer[i] = ans.get(i);
        }

        return answer;
    }
}