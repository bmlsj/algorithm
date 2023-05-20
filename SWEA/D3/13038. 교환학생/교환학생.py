t = int(input())

for i in range(1, t + 1):

    n = int(input())
    days = list(map(int, input().split()))

    onelist = []
    for a in range(len(days)):
        if days[a] == 1:
            onelist.append(a)

    cntlist = []
    for start in onelist:
        day, cnt = 0, 0
        s = start
        while cnt != n:
            for a in range(start, 7):
                if days[a] == 1:
                    cnt += days[a]
                day += 1
                if cnt == n:
                    break
            start = 0
        cntlist.append(day)

    print(f"#{i} {min(cntlist)}")
