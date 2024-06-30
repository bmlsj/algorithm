
def rotate90(matrix, n):
    newMap = [[0] * n for _ in range(n)]

    for i in range(n):
        for j in range(n):
            newMap[i][j] = matrix[n - j - 1][i]

    return newMap


def rotate180(matrix, n):
    newMap = [[0] * n for _ in range(n)]
    for i in range(n):
        for j in range(n):
            newMap[i][j] = matrix[n - 1 - i][n - 1 - j]

    return newMap


def rotate270(matrix, n):
    newMap = [[0] * n for _ in range(n)]
    for i in range(n):
        for j in range(n):
            newMap[i][j] = matrix[j][n - 1 - i]

    return newMap


T = int(input())
for t in range(T):

    n = int(input())
    matrix = [list(map(int, input().split())) for _ in range(n)]
    map90 = rotate90(matrix, n)
    map180 = rotate180(matrix, n)
    map270 = rotate270(matrix, n)

    print(f"#{t+1}")
    for i in range(n):
        print("".join(map(str, map90[i])), end=' ')
        print("".join(map(str, map180[i])), end=' ')
        print("".join(map(str, map270[i])))