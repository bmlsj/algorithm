import sys
input = sys.stdin.readline
sys.setrecursionlimit(10000000)

while True:
    w, h = map(int, input().split())

    if w == h == 0:
        break

    arr = [list(map(int, input().split())) for _ in range(h)]
    visited = [[0] * w for _ in range(h)]

    def dfs(x, y):
        if x < 0 or x >= h or y < 0 or y >= w:
            return False

        if arr[x][y] == 1 and not visited[x][y]:
            visited[x][y] = 1
            dfs(x - 1, y)
            dfs(x - 1, y - 1)
            dfs(x - 1, y + 1)
            dfs(x + 1, y)
            dfs(x + 1, y - 1)
            dfs(x + 1, y + 1)
            dfs(x, y + 1)
            dfs(x, y - 1)
            return True

        return False

    cnt = 0
    for i in range(h):
        for j in range(w):
            if dfs(i, j):
                cnt += 1

    print(cnt)