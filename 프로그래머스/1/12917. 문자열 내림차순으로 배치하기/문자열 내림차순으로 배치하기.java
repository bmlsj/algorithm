import java.util.*;
class Solution {
    public String solution(String s) {
        String answer = "";
        
        List<Character> charList = new ArrayList<>();
        
        for (char c: s.toCharArray()){
            charList.add(c);
        }
        
        Collections.sort(charList);
        
        StringBuilder sb = new StringBuilder();
        for (int i = charList.size() - 1; i >= 0; i--){
            sb.append(charList.get(i));
        }
        System.out.println(charList);
        return sb.toString();
    }
}