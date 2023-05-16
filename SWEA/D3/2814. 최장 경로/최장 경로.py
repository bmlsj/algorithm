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
        ans = max(cnt, ans)
        for i in graph[v]:
            if not visited[i]:
                visited[i] = True
                dfs(i, cnt + 1)
                visited[i] = False


    ans = 0
    visited = [0] * (n + 1)
    for a in range(1, n + 1):
        visited[a] = True
        dfs(a, 1)
        visited[a] = False

    print(f"#{k} {ans}")
