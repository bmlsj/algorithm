import java.util.*;
class Solution {
    public int solution(String s) {

        Map<String, Integer> map = Map.of(
            "zero", 0,
            "one", 1,
            "two", 2,
            "three", 3,
            "four", 4,
            "five", 5,
            "six", 6,
            "seven", 7,
            "eight", 8,
            "nine", 9
        );
        
        String sen = "";
        String ans = "";
        for(char chr: s.toCharArray()) {
            if (97 <= chr && chr <= 122) {
                sen += chr + "";
            } else {
                ans += chr;
            }
            if (map.containsKey(sen)) {
                ans += String.valueOf(map.get(sen));
                sen = "";
            }
        }
        
        return Integer.parseInt(ans);
    }
}