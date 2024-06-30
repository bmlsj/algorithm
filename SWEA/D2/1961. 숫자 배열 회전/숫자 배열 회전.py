
def rotate90(matrix, n):
    newMap = [[0] * n for _ in range(n)]

    for i in range(n):
        for j in range(n):
            newMap[i][j] = matrix[n - j - 1][i]

    return newMap



T = int(input())
for t in range(T):

    n = int(input())
    matrix = [list(map(int, input().split())) for _ in range(n)]
    map90 = rotate90(matrix, n)
    map180 = rotate90(map90, n)
    map270 = rotate90(map180, n)

    print(f"#{t+1}")
    for i in range(n):
        print("".join(map(str, map90[i])), end=' ')
        print("".join(map(str, map180[i])), end=' ')
        print("".join(map(str, map270[i])))