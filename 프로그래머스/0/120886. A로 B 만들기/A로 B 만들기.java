import java.util.*;

class Solution {
    public int solution(String before, String after) {

        List<Character> beforeList = new ArrayList<>();
        List<Character> afterList = new ArrayList<>();
        
        for (char c: before.toCharArray()) {
            beforeList.add(c);
        }
        
        for (char c: after.toCharArray()) {
            afterList.add(c);
        }
        
       
        for(int i = 0; i < beforeList.size(); i++) {
            for(int j = 0; j < afterList.size(); j++) {
                if (beforeList.get(i) == afterList.get(j)) {
                    afterList.remove(j);
                    break;
                }
            }
        }
        
        return afterList.size() > 0 ? 0 : 1;
    }
}