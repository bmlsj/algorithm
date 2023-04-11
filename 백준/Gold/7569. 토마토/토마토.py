from collections import deque
import sys

input = sys.stdin.readline

m, n, h = map(int, input().split())
tomato = [[list(map(int, input().split())) for _ in range(n)] for _ in range(h)]

q = deque()

for i in range(h):
    for j in range(n):
        for k in range(m):
            if tomato[i][j][k] == 1:
                q.append([i, j, k])


def in_range(d, x, y):
    if 0 <= d < h and 0 <= x < n and 0 <= y < m:
        return False
    return True


def bfs():
    while q:
        h, x, y = q.popleft()

        dh, dx, dy = [0, 0, 0, 0, -1, 1], [-1, 1, 0, 0, 0, 0], [0, 0, -1, 1, 0, 0]
        for i in range(6):
            nh, nx, ny = h + dh[i], x + dx[i], y + dy[i]

            if in_range(nh, nx, ny):
                continue

            if tomato[nh][nx][ny] == -1:
                continue

            if tomato[nh][nx][ny] == 0:
                tomato[nh][nx][ny] = tomato[h][x][y] + 1
                q.append([nh, nx, ny])


bfs()
cnt = 0
flag = True

for i in range(h):
    for j in range(n):
        #         for k in range(m):
        cnt = max(cnt, max(tomato[i][j]) - 1)
        if tomato[i][j].count(0) != 0:
            flag = False

if flag:
    print(cnt)
else:
    print(-1)
