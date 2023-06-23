import sys

input = sys.stdin.readline

n, m = map(int, input().split())
numlist = list(map(int, input().split()))
numlist.sort()

arr = [0] * (m + 1)
s = 0


def seq(cnt):
    if cnt == m:
        print(*order)
        return

    for i in range(n):
        order.append(numlist[i])
        seq(cnt + 1)
        order.pop()


order = []
seq(0)
