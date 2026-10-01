class Solution {
    public int solution(int n, int[] money) {
        int MOD = 1000000007;
        int[] dp = new int[n + 1];
        
        // 0원을 만드는 경우의 수는 1가지 (아무 동전도 선택하지 않는 경우)
        dp[0] = 1;
        
        // 각 동전에 대해 DP 테이블 갱신
        for (int coin : money) {
            for (int i = coin; i <= n; i++) {
                dp[i] = (dp[i] + dp[i - coin]) % MOD;
            }
        }
        
        return dp[n];
    }
}