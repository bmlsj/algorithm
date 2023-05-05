t = int(input())

for p in range(1, t + 1):

    def dfs(x, y, now):
        if len(now) == 7:
            num.add(now)
            return

        dx, dy = [-1, 1, 0, 0], [0, 0, -1, 1]
        for i in range(4):
            nx = x + dx[i]
            ny = y + dy[i]

            if 0 <= nx < 4 and 0 <= ny < 4:
                dfs(nx, ny, now + arr[nx][ny])


    arr = [list(input().split()) for _ in range(4)]
    num = set()

    for k in range(4):
        for j in range(4):
            dfs(k, j, arr[k][j])

    print(f"#{p} {len(num)}")
