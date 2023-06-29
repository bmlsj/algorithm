import sys
input = sys.stdin.readline


# 오른쪽, 오른쪽 위대각선, 오른쪽 아래 대각선
# [0, 1] [-1, 1], [1, 1]

def dfs(x, y):
    
    visited[x][y] = True

    if y == c - 1:
        return True

    dx, dy = [-1, 0, 1], [1, 1, 1]
    for i in range(3):
        nx = x + dx[i]
        ny = y + dy[i]

        if 0 <= nx < r and pipeline[nx][ny] == '.' and not visited[nx][ny]:
            visited[nx][ny] = True
            if dfs(nx, ny):
                return True

    return False


r, c = map(int, input().split())
pipeline = [list(input()) for _ in range(r)]

cnt = 0
visited = [[False] * c for _ in range(r)]
for a in range(r):
    if pipeline[a][0] == '.':
        if dfs(a, 0):
            cnt += 1

print(cnt)
