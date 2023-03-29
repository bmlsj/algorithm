n, m = map(int, input().split())

ans = [i for i in range(n + 1)]

for _ in range(m):
    a, b = map(int, input().split())
    ans[a], ans[b] = ans[b], ans[a]

for i in range(1, len(ans)):
    print(ans[i], end=' ')