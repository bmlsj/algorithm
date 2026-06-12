class Solution {
    public int solution(int a, int b, int n) {
        int answer = 0;
        
        // 빈병 n -> n/a개 다시 받음
        while(n >= a) {
            
            int remain = n % a;  // 남은 빈병
            int exchange = n / a;
            answer += exchange * b;
            n = remain + exchange * b;
            
        }
        
        
        
        return answer;
    }
}