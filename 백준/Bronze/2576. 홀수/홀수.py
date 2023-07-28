ans = []

for _ in range(7):
    num = int(input())
    if num % 2:
        ans.append(num)

if len(ans):
    print(sum(ans))
    print(min(ans))
else:
    print(-1)