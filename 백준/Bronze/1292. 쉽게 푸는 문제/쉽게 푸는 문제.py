a, b = map(int, input().split())

num = []
for i in range(1, b + 1):
    for j in range(i):
        num.append(str(i))

sum = 0
for i in range(a - 1, b):
    sum += int(num[i])

print(sum)
