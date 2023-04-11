import sys
input = sys.stdin.readline

n, m = map(int, input().split())
cnt = -1
for i in range(n*m):
    cnt += 1
print(cnt)