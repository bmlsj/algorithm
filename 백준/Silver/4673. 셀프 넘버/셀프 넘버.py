INF = 10000
numlist = set()
for n in range(1, INF + 1):
    num = str(n)
    ans = n
    for i in num:
        ans += int(i)

    numlist.add(ans)

for n in range(1, INF+1):
    if n not in numlist:
        print(n)