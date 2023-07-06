import sys
input = sys.stdin.readline

d, k = map(int, input().split())
dp = [0] * d

for i in range(1, 100000):
    for j in range(1, 100000):
        dp[0], dp[1] = i, j
        for a in range(2, d):
            dp[a] = dp[a - 1] + dp[a - 2]

        if dp[-1] == k:
            print(dp[0])
            print(dp[1])
            exit()

