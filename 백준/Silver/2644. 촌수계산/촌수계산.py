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


def bfs(v):
    q = deque()
    q.append(v)

    while q:
        x = q.popleft()

        for i in relation[x]:
            if not visited[i]:
                q.append(i)
                visited[i] = visited[x] + 1


bfs(p1)

print(visited[p2] if visited[p2] > 0 else -1)