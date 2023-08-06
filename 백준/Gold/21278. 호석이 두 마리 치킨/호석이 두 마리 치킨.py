n, m = map(int, input().split())
INF = int(10e6)
buildings = [[INF] * (n + 1) for _ in range(n + 1)]

for _ in range(m):
    a, b = map(int, input().split())
    buildings[a][b] = 2
    buildings[b][a] = 2

for k in range(1, n + 1):
    for a in range(1, n + 1):
        for b in range(1, n + 1):
            if a == b:
                buildings[a][b] = 0
                continue

            buildings[a][b] = min(buildings[a][b], buildings[a][k] + buildings[k][b])

ans_idx = {i: 0 for i in range(1, n + 1)}
dis = []
for i in range(1, len(buildings)):
    ans = INF
    for value in buildings[i]:
        if value != 0:
            ans = min(ans, value)
    dis.append(ans)
    ans_idx[buildings[i].index(ans)] += 1

ans_idx = sorted(ans_idx.items(), key=lambda t: (t[0], -t[1]))
print(ans_idx[0][0], ans_idx[1][0], sum(dis[2:]))
