import java.util.*;

class Solution {
    public int solution(int[] array, int n) {
 
        Arrays.toString(array);
        
        int closet = array[0];
        int minDiff = Math.abs(n - array[0]);
        
        for(int i = 1; i < array.length; i++) {
            int diff = Math.abs(n - array[i]);
            if (diff < minDiff) {
                minDiff = diff;
                closet = array[i];
            } else if (diff == minDiff && array[i] < closet) {
                // 차이가 같은 경우
                closet = array[i];
            }
        }
        
        return closet;
    }
}