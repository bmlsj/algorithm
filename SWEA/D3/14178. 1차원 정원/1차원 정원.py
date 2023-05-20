t = int(input())

for i in range(1, t + 1):
    n, d = map(int, input().split())
    # [x - d, x + d]

    # cnt = n // (2 * d + 1)
    cnt = 0
    while n >= d:

        cnt += 1
        n -= (2 * d + 1)

    if n > 0:
        cnt += 1
    print(f"#{i} {cnt}")
