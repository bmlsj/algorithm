import java.util.*;
class Solution {
    public String solution(int[] food) {
        String answer = "";
        
        StringBuilder left = new StringBuilder();

        for (int i = 1; i < food.length; i++) {
            left.append(String.valueOf(i).repeat(food[i] / 2));
        }

        String right = new StringBuilder(left).reverse().toString();
        
        return left.toString() + "0" + right.toString();
    }
}