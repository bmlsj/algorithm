n, m = map(int, input().split())
arr = [0] * (m + 1)
visited = [False] * (n + 1)

def func(k):
    if k == m:
        for i in range(m):
            print(arr[i], end=' ')
        print()
        return

    for i in range(1, n + 1):
        if not visited[i]:
            arr[k] = i
            visited[i] = True
            visited[i] = False
            func(k+1)

func(0)
