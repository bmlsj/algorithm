import sys

input = sys.stdin.readline

n, s = map(int, input().split())
arr = list(map(int, input().split()))
cnt = 0


def dfs(cur, t):
    global cnt

    if cur == n:
        if t == s:
            cnt += 1
        return

    dfs(cur + 1, t)
    dfs(cur + 1, t + arr[cur])

dfs(0, 0)

print(cnt if s != 0 else cnt - 1)