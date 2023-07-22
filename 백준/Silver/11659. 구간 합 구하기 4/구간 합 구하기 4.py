import sys
input = sys.stdin.readline

n, m = map(int, input().split())
numlist = list(map(int, input().split()))
sumlist = [0]

tmp = 0
for i in numlist:
    tmp += i
    sumlist.append(tmp)

for _ in range(m):
    a, b = map(int, input().split())
    print(sumlist[b] - sumlist[a-1])