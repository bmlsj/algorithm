
m = int(input())
n = int(input())

num = []
for x in range(m, n+1):
    for i in range(2, x+1):
        if x % i == 0:
            if x == i:
                num.append(x)
            break

if len(num) > 0:
    print(sum(num), min(num))

else:
    print(-1)