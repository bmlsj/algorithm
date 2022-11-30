N = int(input())
num = list(map(int, input().split()))

ans = []
for i in num:
    cnt = 0
    for j in range(1, i + 1):
        if i % j == 0:
            cnt += 1
    ans.append(cnt)

minority = 0
for i in ans:
    if i == 2:
        minority += 1

print(minority)
