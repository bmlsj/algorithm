import java.util.*;
class Solution {
    public int solution(int[] A, int[] B) {
        int answer = 0;
        
        // A팀을 이기는 B팀의 출전 순서
        Arrays.sort(A);
        Arrays.sort(B);
        
        int i = 0, j = 0;
        
        while(i < A.length && j < B.length) {
            if (B[j] > A[i]) {
                // B win
                answer++;
                i++;
            }
            j++;
        }
        
        
        return answer;
    }
}