import sys
input = sys.stdin.readline
n = int(input())

# 1과 00만 사용 가능
dp = [0] * (n + 1)
dp[0] = 1  # 1
dp[1] = 2  # 00, 11

for i in range(2, n + 1):
    dp[i] = (dp[i - 1] + dp[i - 2])  % 15746

print(dp[n-1])