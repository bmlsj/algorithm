from collections import deque

def countBomb(x, y):
    cnt = 0

    for i in range(8):
        nx = x + dx[i]
        ny = y + dy[i]

        if nx < 0 or nx >= n or ny < 0 or ny >= n:
            continue

        if matrix[nx][ny] == '*':
            cnt += 1

    matrix[x][y] = cnt


def punkCnt(x, y):

    global cnt
    q = deque()
    q.append([x, y])
    matrix[x][y] = '*'

    while q:
        a, b = q.popleft()

        for i in range(8):
            nx = a + dx[i]
            ny = b + dy[i]

            if nx < 0 or nx >= n or ny < 0 or ny >= n:
                continue

            if matrix[nx][ny] == 0:
                matrix[nx][ny] = '*'
                q.append([nx, ny])

            elif matrix[nx][ny] != '*':
                matrix[nx][ny] = '*'
                cnt += 1


T = int(input())
dx, dy = [-1, 1, 0, 0, 1, 1, -1, -1], [0, 0, -1, 1, 1, -1, 1, -1]

for t in range(1, T + 1):

    n = int(input())
    matrix = [list(input()) for _ in range(n)]

    for i in range(n):
        for j in range(n):
            if matrix[i][j] == '.':
                countBomb(i, j)

    # for i in range(n):
    #     print(*matrix[i], end=' ')
    #     print()

    cnt = 0
    tmp = 0
    for i in range(n):
        for j in range(n):
            if matrix[i][j] == 0:
                punkCnt(i, j)
                tmp += 1

    cnt = 0
    for i in range(n):
        for j in range(n):
            if matrix[i][j] != '*':
                cnt += 1


    print(f"#{t} {tmp + cnt}")

