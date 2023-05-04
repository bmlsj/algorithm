t = int(input())

for i in range(1, t + 1):

    m, n = map(int, input().split())
    alist = list(map(int, input().split()))
    blist = list(map(int, input().split()))
    result = []

    if n > m:
        for k in range(n - m + 1):
            ans = 0
            for j in range(m):
                ans += (alist[j] * blist[k + j])

            result.append(ans)
    else:
        for k in range(m - n + 1):
            ans = 0
            for j in range(n):
                ans += (alist[k + j] * blist[j])

            result.append(ans)

    print(f"#{i} {max(result)}")
