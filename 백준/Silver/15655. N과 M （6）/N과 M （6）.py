import sys
input = sys.stdin.readline

n, m = map(int, input().split())
numlist = list(map(int, input().split()))
numlist.sort()
arr = [0] * (m + 1)
visited = [False] * (n + 1)
s = 0

def func(k):
    global s
    if k == m:
        for i in range(m):
            print(arr[i], end=' ')
        print()
        return

    for i in range(s, n):
        if not visited[i]:
            arr[k] = numlist[i]
            visited[i] = True
            s = i + 1
            func(k + 1)
            visited[i] = False


func(0)
