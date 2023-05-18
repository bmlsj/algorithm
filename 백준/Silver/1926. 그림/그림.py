# 그림의 개수, 그림 중 가장 넓은 것의 넓이
import sys
input = sys.stdin.readline
sys.setrecursionlimit(10**6)

n, m = map(int, input().split())
arr = [list(map(int, input().split())) for _ in range(n)]
visited = [[False] * m for _ in range(n)]


def dfs(x, y):

    global area

    dx, dy = [-1, 1, 0, 0], [0, 0, -1, 1]
    if x < 0 or x >= n or y < 0 or y >= m:
        return False

    if arr[x][y] == 1:
        arr[x][y] = 0
        area += 1
        for t in range(4):
            nx = x + dx[t]
            ny = y + dy[t]
            dfs(nx, ny)
        return True
    return False


area = ans = 0
cnt = 0
for i in range(n):
    for j in range(m):
        if dfs(i, j):
            ans = max(area, ans)
            area = 0
            cnt += 1


print(cnt)
print(ans)

