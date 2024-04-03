a, b = map(int, input().split())
cnt = 1

while True:

    if b == a:
        print(cnt)
        break
    elif b < a:
        print(-1)
        break
    elif str(b)[-1] == '1':
        b = int(str(b)[:-1])
        cnt += 1
    elif b % 2 == 0:
        b //= 2
        cnt += 1
    else:
        print(-1)
        break

