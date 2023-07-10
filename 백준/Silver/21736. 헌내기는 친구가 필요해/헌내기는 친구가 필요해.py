import sys
input = sys.stdin.readline
sys.setrecursionlimit(360000)

n, m = map(int, input().split())
campus = [list(input()) for _ in range(n)]


def dfs(x, y):

    global cnt
    visited[x][y] = True
    dx, dy = [-1, 1, 0, 0], [0, 0, -1, 1]
    for i in range(4):
        nx = x + dx[i]
        ny = y + dy[i]

        if nx < 0 or nx >= n or ny < 0 or ny >= m:
            continue

        if not visited[nx][ny]:
            visited[nx][ny] = True
            if campus[nx][ny] == 'O':
                dfs(nx, ny)

            elif campus[nx][ny] == 'P':
                dfs(nx, ny)
                cnt += 1


cnt = 0
visited = [[False] * m for _ in range(n)]
for i in range(n):
    for j in range(m):
        if campus[i][j] == 'I':
            dfs(i, j)
            break

print('TT' if not cnt else cnt)