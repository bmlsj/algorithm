import java.util.*;
class Solution {
    public int[] solution(int[] arr) {
        int[] answer = {};
        int idx1 = -1, idx2 = -1;
        for(int i = 0; i < arr.length; i++) {
            if (arr[i] == 2) {
                idx1 = i;
                break;
            }
        }
        
        for(int i = arr.length - 1; i >= 0; i--) {
            if(arr[i] == 2) {
                idx2 = i;
                break;
            }
        }
        
        int[] ans;
        if (idx1 == -1) return new int[]{-1};
        else if (idx1 == idx2) return new int[]{arr[idx1]};
        else {
            ans = new int[idx2 - idx1 + 1];
            int idx = 0;
            for(int i = idx1; i <= idx2; i++) {
                ans[idx++] = arr[i];
            }
            
        }
        System.out.println(idx1 + " " + idx2);
        return ans;
    }
}