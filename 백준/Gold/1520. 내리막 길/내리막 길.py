import sys

input = sys.stdin.readline
sys.setrecursionlimit(10 ** 6)

m, n = map(int, input().split())
arr = [list(map(int, input().split())) for _ in range(m)]
visited = [[-1] * n for _ in range(m)]


def dfs(x, y):

    if x == m - 1 and y == n - 1:
        return 1

    if visited[x][y] != -1:
        return visited[x][y]

    cnt = 0
    dx, dy = [-1, 1, 0, 0], [0, 0, -1, 1]
    for i in range(4):
        nx = x + dx[i]
        ny = y + dy[i]

        if nx < 0 or nx >= m or ny < 0 or ny >= n:
            continue

        if arr[x][y] > arr[nx][ny]:
            cnt += dfs(nx, ny)

    visited[x][y] = cnt
    return visited[x][y]


print(dfs(0, 0))
