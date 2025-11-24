import java.util.*;
class Solution {
    public String[] solution(String[] strings, int n) {
        
        Arrays.sort(strings, (a, b) -> {
            char ca = a.charAt(n);
            char cb = b.charAt(n);
            
            if (ca != cb) {
                return Character.compare(ca, cb);
            }
            
            return a.compareTo(b);
        });
        return strings;
    }
}