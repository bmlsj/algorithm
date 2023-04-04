import sys
input = sys.stdin.readline

n = int(input())
a = list(map(int, input().split()))
b, c = map(int, input().split())

cnt = 0
for i in range(len(a)):
    if a[i] <= b:
        cnt += 1
    else:
        cnt += 1
        a[i] -= b
        if a[i] % c == 0:
            cnt += (a[i] // c)
        else:
            cnt += (a[i] // c) + 1

print(cnt)