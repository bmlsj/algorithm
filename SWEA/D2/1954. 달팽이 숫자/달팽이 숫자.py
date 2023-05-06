T = int(input())

for k in range(1, T + 1):
    N = int(input())

    # i, j를 증가를 저장할 리스트

    di = []
    dj = []

    for n in range(N, 0, -1):
        for _ in range(n):
            di.append(0)

            if (N - n) % 2 == 0:
                dj.append(1)
            else:
                dj.append(-1)

        for _ in range(n - 1):
            di.append(1 - (2 * ((N - n) % 2)))
            dj.append(0)

    # 2차원 배열 초기화 : NxN
    arr = [[0] * N for _ in range(N)]

    i = j = 0
    for n in range(1, N * N + 1):
        if n == 1:  # (0, 0)
            arr[i][j] = 1
        else:
            i += di[n - 1]
            j += dj[n - 1]
            arr[i][j] = n

    print(f"#{k}")

    for list in arr:
        print(*list)
