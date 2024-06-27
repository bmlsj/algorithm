import java.util.ArrayList;
import java.util.Collections;

class Solution {
    public ArrayList<Integer> solution(int[] arr, int[][] queries) {
        ArrayList<Integer> answer = new ArrayList<>();

        for (int i = 0; i < queries.length; i++){
            int s = queries[i][0], e = queries[i][1], k = queries[i][2];
            ArrayList<Integer> tmp = new ArrayList<>();
            for (int j = s; j <= e; j++){
                if ( arr[j] > k) tmp.add(arr[j]);
            }
            if (tmp.isEmpty()) {
                answer.add(-1);
            } else {
                answer.add(Collections.min(tmp));
            }
        }

        return answer;
    }
}