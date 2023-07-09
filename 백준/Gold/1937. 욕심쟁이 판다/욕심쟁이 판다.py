import sys
input = sys.stdin.readline
sys.setrecursionlimit(40000)

n = int(input())
arr = [list(map(int, input().split())) for _ in range(n)]


def dfs(x, y):
    dx, dy = [-1, 1, 0, 0], [0, 0, -1, 1]

    visited[x][y] = 1
    for i in range(4):
        nx = x + dx[i]
        ny = y + dy[i]

        if 0 <= nx < n and 0 <= ny < n and arr[x][y] < arr[nx][ny]:
            if not visited[nx][ny]:
                visited[nx][ny] = 1
                dfs(nx, ny)
            visited[x][y] = max(visited[x][y], visited[nx][ny] + 1)


visited = [[0] * n for _ in range(n)]
ans = 0
for i in range(n - 1, -1, -1):
    for j in range(n - 1, -1, -1):
        visited[i][j] = 1
        dfs(i, j)
        ans = max(ans, visited[i][j])

print(ans)
