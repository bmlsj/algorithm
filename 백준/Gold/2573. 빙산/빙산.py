from collections import deque
import sys
sys.setrecursionlimit(10000)
input = sys.stdin.readline

n, m = map(int, input().split())
ice = [list(map(int, input().split())) for _ in range(n)]

visited = [[0] * m for _ in range(n)]
q = deque()


def bfs():
    seaList = []
    for i in range(n):
        for j in range(m):
            if ice[i][j]:
                q.append([i, j])

    while q:
        a, b = q.popleft()
        sea = 0

        dx, dy = [-1, 1, 0, 0], [0, 0, -1, 1]
        for i in range(4):
            nx = a + dx[i]
            ny = b + dy[i]

            if 0 <= nx < n and 0 <= ny < m and ice[nx][ny] == 0:
                sea += 1

        if sea:
            seaList.append((a, b, sea))

    for x, y, sea in seaList:
        ice[x][y] -= sea
        if ice[x][y] < 0:
            ice[x][y] = 0

    return 1


def dfs(x, y):
    if x <= -1 or x >= n or y <= -1 or y >= m:
        return False

    if visited[x][y] == 1:
        visited[x][y] = 0
        dfs(x - 1, y)
        dfs(x, y - 1)
        dfs(x + 1, y)
        dfs(x, y + 1)
        return True
    return False


def ice_cnt():
    bfs()  # 빙하를 녹임

    tmp = 0
    for i in range(n):
        for j in range(m):
            if ice[i][j]:
                visited[i][j] = 1

    for i in range(n):  # 빙하 덩어리 개수
        for j in range(m):
            if dfs(i, j):
                tmp += 1
    return tmp


ans = ice_cnt()
group = 1
while True:

    if all(ice[i][j] == 0 for i in range(n) for j in range(m)):
        print(0)
        break

    if ans >= 2:
        print(group)
        break

    else:
        ans = ice_cnt()
        group += 1
