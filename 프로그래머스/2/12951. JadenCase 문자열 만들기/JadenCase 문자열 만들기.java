import java.util.*;

class Solution {
    public String solution(String s) {
        String[] split = s.split(" ");
        StringBuilder ans = new StringBuilder(); 
        
        for (int i = 0; i < split.length; i++) {
            String origin = split[i];
            StringBuilder tmp = new StringBuilder(); 
            
            for (int j = 0; j < origin.length(); j++) {
                char currentChar = origin.charAt(j);
                
                if (j == 0) { // 첫번째 문자인 경우
                    if (!Character.isDigit(currentChar)) {  // 문자인 경우, 대문자
                        tmp.append(Character.toUpperCase(currentChar));
                    } else {
                        tmp.append(currentChar); 
                    }
                } else {  // 2번째 문자부터는 그냥 넣음
                    tmp.append(Character.toLowerCase(currentChar)); 
                }
            }
            
            split[i] = tmp.toString(); 
        }

        ans.append(String.join(" ", split));
        while (ans.length() != s.length()) {
            ans.append(" ");
        }
        
        return ans.toString();
    }
}
