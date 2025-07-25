import java.util.*;
class Solution {
    public int solution(String[] strArr) {
        int[] strArrLen = new int[100000];
        
        for(String str: strArr) {
            strArrLen[str.length()]++;
        }
        
        int max = -1;
        for(int i = 0; i < strArrLen.length; i++) {
            if (strArrLen[i] > max) max = strArrLen[i];
        }
        return max;
    }
}