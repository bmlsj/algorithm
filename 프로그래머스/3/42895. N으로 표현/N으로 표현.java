import java.util.*;
class Solution {
    public int solution(int N, int number) {
        int answer = -1;
        
        
        if (N == number) return 1;
        // number를 표현하는 방법 중, 5를 가장 적게 사용한 수
        List<Set<Integer>> list = new ArrayList<>();
        for(int i = 0; i <= 8; i++) {
            list.add(new HashSet<>());
        }
                
        // N, NN, NNN 숫자
        int[] dp = new int[8];
        dp[0] = N;
        list.get(1).add(dp[0]);
        
        for(int i = 1; i < 8; i++) {
            dp[i] = dp[i-1] * 10 + N;
            list.get(i + 1).add(dp[i]);
        }
        
        for(int k = 2; k <= 8; k++) {
            Set<Integer> curr = list.get(k);
            
            // i번 사용한 집합 + (k - i)번 사용한 집합 조합
            for(int i = 1; i < k; i++) {
                Set<Integer> pre = list.get(i);
                Set<Integer> post = list.get(k - i);
                
                for(int a: pre) {
                    for(int b: post) {
                        curr.add(a + b);
                        curr.add(a - b);
                        curr.add(a * b);
                        if (b != 0) {
                            curr.add(a / b);
                        }
                    }
                }
            }
            
            if (curr.contains(number)) {
                return k;
            }
        }
        
        
        return answer;
    }
}