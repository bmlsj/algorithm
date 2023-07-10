import sys

input = sys.stdin.readline


def dfs(v, depth):
    global ans
    visited[v] = True

    if depth >= 4:
        ans = True
        return
    if ans:
        return

    for i in graph[v]:
        if not visited[i]:
            dfs(i, depth + 1)
            visited[i] = False


n, m = map(int, input().split())
graph = [[] for _ in range(n)]

for _ in range(m):
    a, b = map(int, input().split())
    graph[a].append(b)
    graph[b].append(a)

visited = [False] * n
ans = False
for i in range(n):
    dfs(i, 0)
    visited[i] = False
    if ans:
        break

print(1 if ans else 0)
