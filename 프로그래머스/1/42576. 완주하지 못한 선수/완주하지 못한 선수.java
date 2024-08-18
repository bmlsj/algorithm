import java.util.*;
class Solution {
    public String solution(String[] participant, String[] completion) {
        String answer = "";
        
        HashMap<String, Integer> part = new HashMap<>();
        HashMap<String, Integer> comp = new HashMap<>();
        for (String name : participant) {
            part.put(name, part.getOrDefault(name, 0) + 1);
        }
        for (String name : completion) {
            comp.put(name, comp.getOrDefault(name, 0) + 1);
        }
        
        HashMap<String, Integer> result = new HashMap<>();
        for (String name : part.keySet()) {
            int partCnt = part.get(name);
            int compCnt = comp.getOrDefault(name, 0); 
            int diff = partCnt - compCnt;
            if (diff > 0) {
                result.put(name, diff);
            }
        }
        
        for (String key : result.keySet()) {
            answer += key;
        }
        return answer;
    }
}