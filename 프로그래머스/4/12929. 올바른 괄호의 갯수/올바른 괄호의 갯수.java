class Solution {
    static int answer;
    public int solution(int n) {
        answer = 0;
        
        dfs(0, 0, n);
        
        return answer;
    }
    
    static void dfs(int open, int close, int n) {
        
        if  (open == n && close == n) {
            answer++;
            return;
        }
        
        if (open < n) {
            dfs(open + 1, close, n);
        }
 
        
        // 닫힌 괄호가 남았을 때
        if (close < open) {
            dfs(open, close + 1, n);
        }
    }
}