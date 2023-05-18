t = int(input())

result = []
for i in range(1, t + 1):

    n = input()

    while len(n) != 1:
        res = 0
        for a in n:
            res += int(a)
        n = str(res)

    result.append(n)

for i in range(t):
    print(f"#{i+1} {result[i]}")
