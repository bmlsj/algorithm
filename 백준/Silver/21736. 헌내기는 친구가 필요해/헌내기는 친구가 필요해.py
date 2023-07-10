import sys
from collections import deque
input = sys.stdin.readline


n, m = map(int, input().split())
campus = [list(input()) for _ in range(n)]
queue = deque()
visited = [[False] * m for _ in range(n)]

for i in range(n):
    for j in range(m):
        if campus[i][j] == 'I':
            queue.append([i, j])
            break

def bfs():

    global cnt
    while queue:
        a, b = queue.popleft()

        dx, dy = [-1, 1, 0, 0], [0, 0, -1, 1]
        for idx in range(4):
            nx = a + dx[idx]
            ny = b + dy[idx]

            if nx < 0 or nx >= n or ny < 0 or ny >= m:
                continue

            if not visited[nx][ny]:
                visited[nx][ny] = True
                if campus[nx][ny] == 'O':
                    queue.append([nx, ny])

                elif campus[nx][ny] == 'P':
                    queue.append([nx, ny])
                    cnt += 1

cnt = 0
bfs()
print(cnt if cnt else 'TT')