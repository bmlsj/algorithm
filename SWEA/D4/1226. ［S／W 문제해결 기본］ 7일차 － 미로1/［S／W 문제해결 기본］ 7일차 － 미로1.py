for i in range(1, 11):

    # 0: 길, 2: 출발점, 3: 도착점
    n = int(input())
    arr = [list(map(int, input())) for _ in range(16)]
    ans = 0

    def dfs(x, y):
        global ans
        arr[x][y] = 1

        dx, dy = [-1, 1, 0, 0], [0, 0, -1, 1]
        for i in range(4):
            nx = x + dx[i]
            ny = y + dy[i]

            if arr[nx][ny] == 3:
                ans = 1
                return

            if 0 <= nx < 16 and 0 <= ny < 16 and arr[nx][ny] == 0:
                arr[nx][ny] = 1
                dfs(nx, ny)


    dfs(1, 1)
    print(f"#{n} {1 if ans else 0}")