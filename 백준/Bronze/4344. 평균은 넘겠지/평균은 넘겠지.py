
t = int(input())
ans = []
for _ in range(t):

    n, *score = map(int, input().split())

    avg = sum(score) // n
    cnt = 0
    for i in score:
        if i > avg:
            cnt += 1

    ans.append(cnt/n*100)

for i in ans:
    print("{0:.3f}%".format(i))
