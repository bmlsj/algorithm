n, m = map(int, input().split())
arr = [0] * (n + 1)
visited = [False] * (n + 1)
s = 1

def func(k):
    global s
    if k == m:
        for i in range(m):
            print(arr[i], end=' ')
        print()
        return

    for i in range(s, n + 1):
        if not visited[i]:
            arr[k] = i
            visited[i] = True
            s = arr[k]
            func(k + 1)
            visited[i] = False

func(0)
