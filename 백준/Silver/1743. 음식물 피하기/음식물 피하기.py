import sys
sys.setrecursionlimit(10**6)
input = sys.stdin.readline

n, m, k = map(int, input().split())
arr = [[0] * m for _ in range(n)]
visited = [[False] * m for _ in range(n)]
for _ in range(k):
    r, c = map(int, input().split())
    arr[r-1][c-1] = 1


def dfs(x, y, cnt):

    visited[x][y] = True
    cnt += 1

    dx, dy = [-1, 1, 0, 0], [0, 0, -1, 1]
    for i in range(4):
        nx = x + dx[i]
        ny = y + dy[i]

        if 0 <= nx < n and 0 <= ny < m and not visited[nx][ny] and arr[nx][ny]:
            visited[nx][ny] = True
            cnt += dfs(nx, ny, 0)

    return cnt

ans = 0
for i in range(n):
    for j in range(m):
        if arr[i][j]:
            ans = max(ans, dfs(i, j, 0))

print(ans)
