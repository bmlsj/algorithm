import sys
sys.setrecursionlimit(1000000)
input = sys.stdin.readline

n, m = map(int, input().split())
arr = [[] for _ in range(n + 1)]
visited = [False for _ in range(n + 1)]

for _ in range(m):
    a, b = map(int, input().split())
    arr[a].append(b)
    arr[b].append(a)
    arr[a].sort()
    arr[b].sort()

def dfs(v):
    visited[v] = True

    for i in arr[v]:
        if not visited[i]:
            visited[i] = True
            dfs(i)

cnt = 0
for i in range(1, n + 1):
    if not visited[i]:
        cnt += 1
        dfs(i)

print(cnt)
