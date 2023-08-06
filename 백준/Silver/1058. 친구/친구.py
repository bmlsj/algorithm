import sys
input = sys.stdin.readline

n = int(input())
friends = [list(input()) for _ in range(n)]
distance = [[0] * n for _ in range(n)]

for k in range(n):
    for a in range(n):
        for b in range(n):
            if a == b:
                continue

            elif friends[a][b] == 'Y' or (friends[a][k] == 'Y' and friends[k][b] == 'Y'):
                distance[a][b] = 1

ans = 0
for d in distance:
    ans = max(ans, sum(d))

print(ans)
