import java.util.*;
class Solution {
    public int solution(int[][] board, int[] moves) {
        int answer = 0;
        // [1,5,3,5,1,2,1,4]
        Stack<Integer> st = new Stack<>();
        for (int m : moves) {
            for (int j = 0; j < board[0].length; j++) {
                if (board[j][m - 1] != 0) {
                    if (!st.empty() && st.peek() == board[j][m - 1]) {
                        st.pop();
                        answer += 2;
                    } else {
                        st.push(board[j][m - 1]);
                    }
                    board[j][m - 1] = 0;
                    break;
                }
            }
        }
        System.out.println(st);
        return answer;
    }

}