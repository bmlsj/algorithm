from collections import deque

t = int(input())

for k in range(1, t + 1):
    n, m = map(int, input().split())

    # 정점 개수 : n / 간선 개수 : m
    graph = [[] for _ in range(n + 1)]

    for _ in range(m):
        a, b = map(int, input().split())
        graph[a].append(b)
        graph[b].append(a)
        graph[a].sort()
        graph[b].sort()


    def dfs(v, cnt):
        global ans

        if ans < cnt:
            ans = cnt

        for i in graph[v]:
            if not visited[i]:
                visited[v] = True
                dfs(i, cnt + 1)
                visited[v] = False


    cnt = 1
    visited = [False] * (n + 1)

    ans = 0
    for a in range(1, n + 1):
        visited[a] = True
        dfs(a, 1)
        visited[a] = False

    print(f"#{k} {ans}")
