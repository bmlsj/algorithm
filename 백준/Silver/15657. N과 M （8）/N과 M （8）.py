import sys

input = sys.stdin.readline

n, m = map(int, input().split())
numlist = list(map(int, input().split()))
numlist.sort()

arr = [0] * (m + 1)
s = 0


def seq(k):
    global s
    if k == m:
        for i in range(m):
            print(arr[i], end=' ')
        print()
        return

    for i in range(s, n):
        arr[k] = numlist[i]
        s = i
        seq(k + 1)


seq(0)
