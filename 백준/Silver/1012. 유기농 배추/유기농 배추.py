# 필요한 배추지렁이의 최소 마리수
# nxm 배열
# 배추 위치 개수 k
import sys
sys.setrecursionlimit(10000)

input = sys.stdin.readline

t = int(input())

for _ in range(t):
    n, m, k = map(int, input().split())
    arr = [[0 for _ in range(m)] for _ in range(n)]

    for _ in range(k):
        a, b = map(int, input().split())
        arr[a][b] = 1  # 배추가 있는 장소 1


    def dfs(x, y):
        if x < 0 or x >= n or y < 0 or y >= m:
            return False

        if arr[x][y] == 1:
            arr[x][y] = 0
            dfs(x - 1, y)
            dfs(x + 1, y)
            dfs(x, y - 1)
            dfs(x, y + 1)
            return True
        return False

    cnt = 0
    for i in range(n):
        for j in range(m):
            if dfs(i, j):
                cnt += 1

    print(cnt)