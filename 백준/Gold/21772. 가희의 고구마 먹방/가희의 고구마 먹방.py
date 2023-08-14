import sys
input = sys.stdin.readline

r, c, t = map(int, input().split())
gahi = [list(input()) for _ in range(r)]
cntlist = []


def findGoguma(a, b, time, cnt):
    if time == t:
        cntlist.append(cnt)
        return

    dx, dy = [1, -1, 0, 0], [0, 0, -1, 1]
    for i in range(4):
        nx = a + dx[i]
        ny = b + dy[i]

        if nx < 0 or ny < 0 or nx >= r or ny >= c:
            continue

        if gahi[nx][ny] == 'S':
            gahi[nx][ny] = '.'
            findGoguma(nx, ny, time + 1, cnt + 1)
            gahi[nx][ny] = 'S'

        elif gahi[nx][ny] == '.':
            findGoguma(nx, ny, time + 1, cnt)


sx, sy = 0, 0
for i in range(r):
    for j in range(c):
        if gahi[i][j] == 'G':
            sx, sy = i, j
            gahi[i][j] = '.'
            break

findGoguma(sx, sy, 0, 0)
print(max(cntlist) if len(cntlist) else 0)
