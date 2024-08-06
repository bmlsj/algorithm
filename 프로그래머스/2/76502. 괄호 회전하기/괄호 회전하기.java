import java.util.*;

class Solution {
    public static boolean check(String s) {
        Stack<Character> stack = new Stack<>();
        
        for (char ch : s.toCharArray()) {
            if (ch == '(' || ch == '{' || ch == '['){
                stack.add(ch);
            } else if (ch == ')'){
                if (stack.empty() || stack.peek() != '(') {
                    return false;
                }
                stack.pop();
            } else if (ch == '}'){
                if (stack.empty() || stack.peek() != '{') {
                    return false;
                }
                stack.pop();
            } else if (ch == ']'){
                if (stack.empty() || stack.peek() != '[') {
                    return false;
                }
                stack.pop();
            } 
        }
        System.out.println(stack);
        return stack.empty() ? true : false;
    }
    
    public static String shiftLeft(String s) {
        return s.substring(1) + s.charAt(0);
    }
    public static int solution(String s) {
        int answer = 0;
        for (int i = 0; i < s.length(); i++){
            s = shiftLeft(s);
            if (check(s)) answer++;
        } 
        
        return answer;
    }
}