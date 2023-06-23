import sys
input = sys.stdin.readline

n, m = map(int, input().split())
numlist = list(map(int, input().split()))
numlist.sort()

arr = [0] * (m + 1)
visited = [0] * (n+1)
def func(k):
    if k == m:
        for i in range(m):
            print(arr[i], end=' ')
        print()
        return

    for i in range(n):
        if not visited[i]:
            visited[i] = True
            arr[k] = numlist[i]
            func(k + 1)
            visited[i] = False


func(0)
