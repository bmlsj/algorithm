import java.util.*;
class Solution {
    public int solution(int number, int limit, int power) {
        int answer = 0;
        
        // 에라토스테네스 체
        int[] divisor = new int[number + 1];
        for(int i = 1; i <= number; i++) {
            for(int j = i; j <= number; j+= i) {
                divisor[j]++;
            }
        }
        
        for(int i = 1; i < divisor.length; i++) {
            if (divisor[i] > limit) {
                answer += power;
            } else {
                answer += divisor[i];
            }
        }
        return answer;
    }
}