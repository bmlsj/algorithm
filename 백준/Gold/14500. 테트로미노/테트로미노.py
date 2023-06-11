import sys

input = sys.stdin.readline

n, m = map(int, input().split())
tetris = [list(map(int, input().split())) for _ in range(n)]


def first(x, y):  # ㅡ, l
    result = 0

    if 0 <= x < n and 0 <= y < m and 0 <= y + 1 < m and 0 <= y + 2 < m and 0 <= y + 3 < m:
        sum_result = tetris[x][y] + tetris[x][y + 1] + tetris[x][y + 2] + tetris[x][y + 3]
        result = max(result, sum_result)

    if 0 <= x < n and 0 <= y < m and 0 <= x + 1 < n and 0 <= x + 2 < n and 0 <= x + 3 < n:
        sum_result = tetris[x][y] + tetris[x + 1][y] + tetris[x + 2][y] + tetris[x + 3][y]
        result = max(result, sum_result)

    return result


def second(x, y):  # ㅁ

    result = 0
    if 0 <= x < n and 0 <= y < m and 0 < x + 1 < n and 0 <= y + 1 < m:
        sum_res = tetris[x][y] + tetris[x][y + 1] + tetris[x + 1][y] + tetris[x + 1][y + 1]
        result = max(result, sum_res)

    return result


def third(x, y):
    result = 0
    if 0 <= x < n and 0 <= y < m and 0 <= x + 1 < n and 0 <= y + 1 < m and 0 <= x + 2 < n:
        sum_res = tetris[x][y] + tetris[x + 1][y] + tetris[x + 1][y + 1] + tetris[x + 2][y + 1]
        result = max(result, sum_res)

    if 0 <= x < n and 0 <= y < m and 0 <= x - 1 < n and 0 <= y + 1 < m and 0 <= y + 2 < m:
        sum_res = tetris[x][y] + tetris[x][y + 1] + tetris[x - 1][y + 1] + tetris[x - 1][y + 2]
        result = max(result, sum_res)

    if 0 <= x < n and 0 <= y < m and 0 <= x + 1 < n and 0 <= y + 1 < m and 0 <= y + 2 < m:
        sum_res = tetris[x][y] + tetris[x][y + 1] + tetris[x + 1][y + 1] + tetris[x + 1][y + 2]
        result = max(sum_res, result)

    if 0 <= x < n and 0 <= x + 1 < n and 0 <= y < m and 0 <= y + 1 < m and 0 <= x - 1 < n:
        sum_res = tetris[x][y] + tetris[x + 1][y] + tetris[x][y + 1] + tetris[x - 1][y + 1]
        result = max(sum_res, result)

    return result


def fourth(x, y):
    result = 0
    if 0 <= x < n and 0 <= y < m and 0 <= x + 1 < n and 0 <= x + 2 < n and 0 <= y + 1 < m:
        sum_res = tetris[x][y] + tetris[x + 1][y] + tetris[x + 2][y] + tetris[x + 1][y + 1]
        result = max(result, sum_res)

    if 0 <= x < n and 0 <= y < m and 0 <= y + 1 < m and 0 <= y + 2 < m and 0 <= x - 1 < n:
        sum_res = tetris[x][y] + tetris[x][y + 1] + tetris[x][y + 2] + tetris[x - 1][y + 1]
        result = max(result, sum_res)

    if 0 <= x < n and 0 <= y < m and 0 <= x - 1 < n and 0 <= x + 1 < n and 0 <= y + 1 < m:
        sum_res = tetris[x][y] + tetris[x][y + 1] + tetris[x - 1][y + 1] + tetris[x + 1][y + 1]
        result = max(result, sum_res)

    if 0 <= x < n and 0 <= y < m and 0 <= y + 1 < m and 0 <= y + 2 < m and 0 <= x + 1 < n:
        sum_res = tetris[x][y] + tetris[x][y + 1] + tetris[x][y + 2] + tetris[x + 1][y + 1]
        result = max(result, sum_res)

    return result


def fifth(x, y):
    result = 0
    if 0 <= x < n and 0 <= y < m and 0 <= x + 1 < n and 0 <= x + 2 < n and 0 <= y + 1 < m:
        max_res = tetris[x][y] + tetris[x + 1][y] + tetris[x + 2][y] + tetris[x + 2][y + 1]
        result = max(result, max_res)

    if 0 <= x < n and 0 <= y < m and 0 <= x + 1 < n and 0 <= x + 2 < n and 0 <= y + 1 < m:
        max_res = tetris[x][y] + tetris[x][y + 1] + tetris[x + 1][y] + tetris[x + 2][y]
        result = max(max_res, result)

    if 0 <= x < n and 0 <= y < m and 0 <= x + 1 < n and 0 <= x + 2 < n and 0 <= y + 1 < m:
        max_res = tetris[x][y] + tetris[x][y + 1] + tetris[x + 1][y + 1] + tetris[x + 2][y + 1]
        result = max(max_res, result)

    if 0 <= x < n and 0 <= y < m and 0 <= x - 1 < n and 0 <= x - 2 < n and 0 <= y + 1 < m:
        max_res = tetris[x][y] + tetris[x][y + 1] + tetris[x - 1][y + 1] + tetris[x - 2][y + 1]
        result = max(result, max_res)

    if 0 <= x < n and 0 <= y < m and 0 <= x + 1 < n and 0 <= y + 2 < m and 0 <= y + 1 < m:
        max_res = tetris[x][y] + tetris[x + 1][y] + tetris[x + 1][y + 1] + tetris[x + 1][y + 2]
        result = max(max_res, result)

    if 0 <= x < n and 0 <= y < m and 0 <= y + 2 < m and 0 <= x - 1 < n and 0 <= y + 1 < m:
        max_res = tetris[x][y] + tetris[x][y + 1] + tetris[x][y + 2] + tetris[x - 1][y + 2]
        result = max(max_res, result)

    if 0 <= x < n and 0 <= y < m and 0 <= x + 1 < n and 0 <= y + 2 < m and 0 <= y + 1 < m:
        max_res = tetris[x][y] + tetris[x + 1][y] + tetris[x][y + 1] + tetris[x][y+2]
        result = max(max_res, result)

    if 0 <= x < n and 0 <= y < m and 0 <= x + 1 < n and 0 <= y + 2 < m and 0 <= y + 1 < m:
        max_res = tetris[x][y] + tetris[x][y+1] + tetris[x][y+2] + tetris[x+1][y+2]
        result = max(max_res, result)

    return result



ans = 0
for i in range(n):
    for j in range(m):
        ans = max(ans, first(i, j), second(i, j), third(i, j), fourth(i, j), fifth(i, j))

print(ans)
