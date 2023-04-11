from collections import deque

n = int(input())  # 사람 수
p1, p2 = map(int, input().split())  # 계산해야하는 수
m = int(input())  # 관계 수

relation = [[] for _ in range(n + 1)]
visited = [0] * (n + 1)

for _ in range(m):
    a, b = map(int, input().split())
    relation[a].append(b)
    relation[b].append(a)

    relation[a].sort()
    relation[b].sort()


def dfs(v):
    for i in relation[v]:
        if not visited[i]:
            visited[i] = visited[v] + 1
            dfs(i)


dfs(p1)

print(visited[p2] if visited[p2] > 0 else -1)
