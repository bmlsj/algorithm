from collections import deque
import sys
input = sys.stdin.readline

m, n = map(int, input().split())

tomato = [list(map(int, input().split())) for _ in range(n)]
queue = deque([])

for i in range(n):
    for j in range(m):
        if tomato[i][j] == 1:
            queue.append([i, j])


def bfs():
    while queue:
        x, y = queue.popleft()

        dx, dy = [-1, 1, 0, 0], [0, 0, -1, 1]
        for i in range(4):
            nx = x + dx[i]
            ny = y + dy[i]

            if nx < 0 or nx >= n or ny < 0 or ny >= m:
                continue

            if tomato[nx][ny] == 0:
                tomato[nx][ny] = tomato[x][y] + 1
                queue.append([nx, ny])


bfs()
result = max(map(max, tomato)) - 1
for i in range(n):
    if tomato[i].count(0) != 0:
        result = -1
        break

print(result)