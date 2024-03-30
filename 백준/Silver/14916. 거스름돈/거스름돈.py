coin = int(input())
n = 0

while coin > 0:
    if coin % 5 == 0:
        n += (coin // 5)
        coin %= 5
    else:
        coin -= 2
        n += 1

if coin:
    print(-1)
else:
    print(n)