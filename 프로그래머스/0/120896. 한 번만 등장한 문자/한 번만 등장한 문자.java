import java.util.*;

class Solution {
    public String solution(String s) {
        
        Map<Character, Integer> hash = new HashMap<>();
        
        for (char c: s.toCharArray()) {
            if (!hash.containsKey(c)) {
                hash.put(c, 0);
            } else {
                hash.put(c, hash.get(c) + 1);
            }
        }
 
        List<String> ansList = new ArrayList<>();
        for (Map.Entry<Character, Integer> entry : hash.entrySet()) {
            char key = entry.getKey();
            int value = entry.getValue();
            if (value == 0) ansList.add(key + "");
        }
        
        Collections.sort(ansList);
        
        return String.join("", ansList);
    }
}