t = int(input())

for i in range(t):
    ans = []
    n = int(input())

    while n >= 1:
        ans.append(n % 2)
        n = n // 2

    for j in range(len(ans)):
        if ans[j] == 1:
            print(j, end=" ")
