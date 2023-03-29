
t = int(input())

for _ in range(t):
    cnt, s = input().split()
    ans = ""
    for c in s:
        ans += (c * int(cnt))

    print(ans)