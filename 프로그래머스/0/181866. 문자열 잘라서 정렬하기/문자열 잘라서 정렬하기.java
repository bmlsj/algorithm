import java.util.*;
class Solution {
    public String[] solution(String myString) {
        String[] answer = myString.split("x");
        List<String> list = new ArrayList<>();
        
        for(String str: answer) {
            if (!str.isEmpty()) {
                list.add(str);
            }
        }
        
        Collections.sort(list);
        return list.toArray(new String[0]);
    }
}