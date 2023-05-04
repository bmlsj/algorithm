from collections import deque
t = int(input())

for p in range(1, t + 1):

    arr = [list(input().split()) for _ in range(4)]
    num = set()

    def bfs(x, y):
        global sen
        q = deque()
        q.append([x, y, arr[x][y]])

        while q:
            a, b, now = q.popleft()

            dx, dy = [-1, 1, 0, 0], [0, 0, -1, 1]
            for i in range(4):
                nx = a + dx[i]
                ny = b + dy[i]

                if len(now) == 7:
                    num.add(now)
                    continue

                if 0 <= nx < 4 and 0 <= ny < 4:
                    # sen += arr[nx][ny]
                    q.append([nx, ny, now + arr[nx][ny]])


    for k in range(4):
        for j in range(4):
            sen = arr[k][j]
            bfs(k, j)

    print(f"#{p} {len(num)}")
