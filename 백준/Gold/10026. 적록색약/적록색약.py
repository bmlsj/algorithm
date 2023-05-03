from collections import deque
import sys
sys.setrecursionlimit(100000)
input = sys.stdin.readline

n = int(input())
arr = [list(input()) for _ in range(n)]
visited = [[False for _ in range(n)] for _ in range(n)]
q = deque()

def colorMap(color):
    for i in range(n):
        for j in range(n):
            if arr[i][j] == color:
                visited[i][j] = 1

    return visited


def dfs(x, y):
    if x < 0 or x >= n or y < 0 or y >= n:
        return False

    if visited[x][y] == 1:
        visited[x][y] = 0
        dfs(x - 1, y)
        dfs(x + 1, y)
        dfs(x, y - 1)
        dfs(x, y + 1)
        return True
    return False


def ColorGroup(color):
    colorMap(color)
    cnt = 0
    for i in range(n):
        for j in range(n):
            if dfs(i, j):
                cnt += 1

    return cnt

# 색약x
print(ColorGroup("R") + ColorGroup("B") + ColorGroup("G"), end=' ')

# 색약O
for i in range(n):
    for j in range(n):
        if arr[i][j] == 'R':
            arr[i][j] = 'G'

print(ColorGroup("G") + ColorGroup("B"))