import sys

input = sys.stdin.readline

k = int(input())
INF = int(1e6)
arr = [0] * (INF + 1)


def prime(n):
    cnt = 0
    for i in range(1, int(n ** 0.5) + 1):
        if i * i <= n:
            cnt += arr[i] * (n // (i * i))
    return cnt


arr[1] = 1
for i in range(1, INF + 1):
    for j in range(2 * i, INF + 1, i):
        arr[j] -= arr[i]

n, m = 0, 2000000000
while n < m-1:
    mid = (n + m) // 2
    if prime(mid) < k:
        n = mid
    else:
        m = mid

print(m)
