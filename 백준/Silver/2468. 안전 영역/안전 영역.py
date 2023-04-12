import sys
sys.setrecursionlimit(10 ** 6)
input = sys.stdin.readline
n = int(input())
building = [list(map(int, input().split())) for _ in range(n)]
check = [[0 for _ in range(n)] for _ in range(n)]


def dfs(x, y):

    if x >= n or x < 0 or y >= n or y < 0:
        return False

    if check[x][y] == 1:
        check[x][y] = 0
        dfs(x - 1, y)
        dfs(x + 1, y)
        dfs(x, y + 1)
        dfs(x, y - 1)
        return True
    return False


m = min(map(min, building))
M = max(map(max, building))
cnt = []

for k in range(m, M + 1):
    check = [[0 for _ in range(n)] for _ in range(n)]
    for i in range(n):
        for j in range(n):
            if building[i][j] >= k:
                check[i][j] = 1

    c = 0
    for i in range(n):
        for j in range(n):
            if dfs(i, j):
                c += 1

    cnt.append(c)

print(max(cnt))
