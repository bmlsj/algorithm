import sys
input = sys.stdin.readline

n, k = map(int, input().split())
coin = [int(input()) for _ in range(n)]
INF = 10001

dp = [INF] * (k + 1)
dp[0] = 0

for i in range(n):
    for j in range(coin[i], k + 1):
        dp[j] = min(dp[j], dp[j - coin[i]] + 1)


if dp[k] == INF:
    print(-1)
else:
    print(dp[k])
