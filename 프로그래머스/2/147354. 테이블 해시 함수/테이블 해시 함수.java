import java.util.*;
class Solution {

    public int solution(int[][] data, int col, int row_begin, int row_end) {
        int answer = 0;
        
        // col번째 컬럼을 기준으로 정렬, 동일하면 첫번째로
        Arrays.sort(data, (a, b) -> {
            if (a[col - 1] == b[col - 1]) {
                return Integer.compare(b[0], a[0]);
            }
            return Integer.compare(a[col - 1], b[col - 1]);
        });
        
        List<Integer> bit = new ArrayList<>();
        for(int i = row_begin; i <= row_end; i++) {
            int s = 0;
            for(int val: data[i - 1]) {
                s += val % i;
            }
            
            answer ^= s;
        }
        
        return answer;
    }
}