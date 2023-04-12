from collections import deque
import sys

input = sys.stdin.readline

n, m, k, x = map(int, input().split())
graph = [[] for _ in range(n + 1)]
visited = [0 for _ in range(n + 1)]

for _ in range(m):
    a, b = map(int, input().split())

    graph[a].append(b)
    graph[a].sort()


def bfs(v):
    q = deque([v])
    visited[v] = 1

    while q:
        a = q.popleft()

        for i in graph[a]:
            if not visited[i]:
                visited[i] = visited[a] + 1
                q.append(i)



bfs(x)
for i in range(len(visited)):
    if visited[i] - 1 == k:
        print(i)

if all(visited[i]-1 != k for i in range(len(visited))):
    print(-1)

