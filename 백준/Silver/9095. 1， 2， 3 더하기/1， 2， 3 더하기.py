import sys
input = sys.stdin.readline

t = int(input())
num = [1, 2, 3]

for _ in range(t):

    goal = int(input())
    dp = [0] * (goal + 1)
    dp[0] = 0

    for i in range(goal + 1):
        if i == 1:
            dp[i] = 1

        elif i == 2:
            dp[i] = 2

        elif i == 3:
            dp[i] = 4

        elif i > 3:
            dp[i] = (dp[i - 1] + dp[i - 2] + dp[i - 3])

    print(dp[goal])
