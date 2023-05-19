n = int(input())
num = 0
res = 0
for i in range(1, n + 1):

    num += i
    res += 1

    if num > n:
        res -= 1
        break

print(res)