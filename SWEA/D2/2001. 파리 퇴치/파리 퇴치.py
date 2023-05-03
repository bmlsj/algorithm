t = int(input())

for a in range(1, 11):

    # n : 배열 크기 / m : 파리채 크기
    n, m = map(int, input().split())
    arr = [list(map(int, input().split())) for _ in range(n)]

    hit = 0
    for i in range(n - m + 1):
        for j in range(n - m + 1):
            pari = 0
            for k in range(m):
                for p in range(m):
                    pari += arr[i + k][j + p]

            hit = max(hit, pari)

    print(f"#{a} {hit}")
