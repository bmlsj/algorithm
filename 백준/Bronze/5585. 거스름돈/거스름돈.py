coin = 1000 - int(input())

cash = [500, 100, 50, 10, 5, 1]
ans = 0

for c in cash:
    ans += (coin // c)
    coin %= c

print(ans)