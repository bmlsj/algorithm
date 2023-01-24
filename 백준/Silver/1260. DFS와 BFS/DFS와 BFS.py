from collections import deque

n, m, v = map(int, input().split())

node = [[] for _ in range(n + 1)]
for _ in range(m):  # 방문한 노드 입력
    a, b = (map(int, input().split()))
    node[a].append(b)
    node[b].append(a)
    node[a].sort()  # 노드 정렬  ex) [4, 1] => [1, 4]
    node[b].sort()


def dfs(node, v, visited):
    visited[v] = True
    print(v, end=' ')

    for i in node[v]:
        if not visited[i]:
            dfs(node, i, visited)


def bfs(node, start, visited):
    queue = deque([start])
    visited[start] = True

    while queue:
        s = queue.popleft()
        print(s, end=' ')

        for i in node[s]:
            if not visited[i]:
                queue.append(i)
                visited[i] = True


visited = [False] * (n + 1)  # 방문한 노드 표시
dfs(node, v, visited)
print()
visited = [False] * (n + 1)
bfs(node, v, visited)
