from collections import deque
import sys

input = sys.stdin.readline


def puyo(x, y):

    queue = deque()
    queue.append([x, y])

    color = field[x][y]
    samePuyo = [[color, x, y]]
    visited[x][y] = True

    while queue:
        a, b = queue.popleft()

        dx, dy = [-1, 1, 0, 0], [0, 0, -1, 1]
        for i in range(4):
            nx = a + dx[i]
            ny = b + dy[i]

            if nx < 0 or nx >= 12 or ny < 0 or ny >= 6:
                continue

            if not visited[nx][ny] and field[nx][ny] == color:
                visited[nx][ny] = True
                samePuyo.append([color, nx, ny])
                queue.append([nx, ny])

    if len(samePuyo) >= 4:
        return samePuyo
    return []


field = [list(input().rstrip()) for _ in range(12)]
res = 0

while True:

    visited = [[False] * 6 for _ in range(12)]
    connected_puyo = []

    for i in range(12):
        for j in range(6):
            if field[i][j] != '.' and not visited[i][j]:
                connected_puyo += puyo(i, j)


    # 연쇄된 뿌요 없을 때
    if len(connected_puyo) == 0:
        break

    # 4개 이상 모였을 경우, 터짐 ('.'로 변경)
    for color, x, y in connected_puyo:
        field[x][y] = '.'

    # 연쇄가 일어난 위의 뿌요들을 아래로 내림
    for color, x, y in connected_puyo:
        for i in range(x, 0, -1):
            field[i][y] = field[i - 1][y]
            field[i - 1][y] = '.'

    res += 1

print(res)
