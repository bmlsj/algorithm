import sys
from collections import deque
sys.setrecursionlimit(10**6)
input = sys.stdin.readline

n, m, k = map(int, input().split())
arr = [[0] * m for _ in range(n)]


def bfs(a, b, cnt):

    queue = deque()
    queue.append([a, b])

    visited[a][b] = True
    cnt += 1

    while queue:
        a, b = queue.popleft()

        dx, dy = [-1, 1, 0, 0], [0, 0, -1, 1]
        for i in range(4):
            nx = a + dx[i]
            ny = b + dy[i]

            if nx < 0 or nx >= n or ny < 0 or ny >= m:
                continue

            if arr[nx][ny] and not visited[nx][ny]:
                visited[nx][ny] = True
                cnt += bfs(nx, ny, 0)

    return cnt


queue = deque()
for _ in range(k):
    r, c = map(int, input().split())
    r, c = r - 1, c - 1
    arr[r][c] = 1

visited = [[0] * m for _ in range(n)]
ans = 0
for i in range(n):
    for j in range(m):
        if arr[i][j] == 1:
            ans = max(ans, bfs(i, j, 0))

print(ans)
