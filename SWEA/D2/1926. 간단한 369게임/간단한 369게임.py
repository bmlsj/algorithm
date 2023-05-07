
n = int(input())
numlist = [str(i) for i in range(1, n+1)]
gugu = ['3', '6', '9']

for idx in range(len(numlist)):
    num = numlist[idx]
    cnt = 0

    for n in num:
        if n in gugu:
            cnt += 1

    if cnt == 1:
        numlist[idx] = '-'
    elif cnt == 2:
        numlist[idx] = '--'

print(*numlist)