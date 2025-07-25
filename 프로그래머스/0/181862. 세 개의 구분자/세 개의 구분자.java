import java.util.*;
class Solution {
    public String[] solution(String myStr) {

        String[] split = myStr.split("a|b|c");
        List<String> filter = new ArrayList<>();
        
        for(String s: split) {
            if (!s.isEmpty()) {
                filter.add(s);
            }
        }
        String[] arr = filter.toArray(new String[filter.size()]);
        return arr.length > 0 ? arr : new String[]{"EMPTY"};
    }
}