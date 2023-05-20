t = int(input())

for i in range(1, t + 1):
    n, d = map(int, input().split())
    cnt = n // (2 * d + 1)

    if n % (2 * d + 1) > 0:
        cnt += 1

    print(f"#{i} {cnt}")