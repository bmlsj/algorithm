n = int(input())
jump = list(map(int, input().split()))
dp = [0] * n

for i in range(n):
    for j in range(1, jump[i] + 1):
        if i + j < n and dp[i+j] == 0:
            dp[i+j] = dp[i] + 1

if dp[1:].count(0):
    print(-1)
else:
    print(dp[n-1])
