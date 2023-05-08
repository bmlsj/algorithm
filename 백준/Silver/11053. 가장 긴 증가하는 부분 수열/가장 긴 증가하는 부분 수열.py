# 2: 17

n = int(input())
arr = list(map(int, input().split()))

dp = [0 for _ in range(n)]
for i in range(len(arr)):
    if i == 0:
        dp[i] = 1
    else:
        max_dp = 0
        for j in range(i):  # arr[i] 이전 값 중 arr[i]보다 작으면서 가장 큰 dp 값을 가진 j를 찾는다.
            if arr[i] > arr[j] and max_dp < dp[j]:
                max_dp = dp[j]

        dp[i] = max_dp + 1

print(max(dp))