# 하루가 지나면 익은 토마토의 인접한 익지 않은 토마토가 익게 된다.
# 며칠이 지나면 다 익게 되는 지, 최소 일수
# 익은 토마토 : 1, 익지 않은 토마토 : 0, 토마토 없음 : -1
# 저장될 때부터 모든 토마토가 익었다면 : 0 출력 / 토마토가 모두 익지 못하는 상황이면 -1 출력

from collections import deque

m, n = map(int, input().split())
tomato = [list(map(int, input().split())) for _ in range(n)]

q = deque([])

cnt = 0

for i in range(n):
    for j in range(m):
        if tomato[i][j] == 1:
            q.append([i, j])


def all_riped_tomato():  # 토마토가 이미 모두 익은 경우
    if all(tomato[i][j] == 1 or tomato[i][j] == -1 for i in range(n) for j in range(m)):
        return True
    return False


def in_range(x, y):
    return x < 0 or x >= n or y < 0 or y >= m


def bfs():
    while q:
        a, b = q.popleft()
        dx, dy = [-1, 1, 0, 0], [0, 0, -1, 1]
        for i in range(4):
            nx = a + dx[i]
            ny = b + dy[i]

            if in_range(nx, ny):
                continue

            if tomato[nx][ny] == 0:
                tomato[nx][ny] = tomato[a][b] + 1
                q.append([nx, ny])


bfs()
if all_riped_tomato():
    print(0)
else:
    for row in tomato:
        for e in row:
            if e == 0:
                print(-1)
                exit(0)
        cnt = max(cnt, max(row))

    print(cnt - 1)
