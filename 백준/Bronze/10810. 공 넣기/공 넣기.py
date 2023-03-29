
n, m = map(int, input().split())

ans = [0 for _ in range(n)]
for _ in range(m):
    a, b, c = map(int, input().split())

    for i in range(a-1, b):
        ans[i] = c

ans = map(str, ans)
print(' '.join(ans))