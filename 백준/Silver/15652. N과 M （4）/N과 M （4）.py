
n, m = map(int, input().split())
arr = [0] * (m+1)
s = 1

def func(k):
    global s
    if k == m:
        for i in range(m):
            print(arr[i], end=' ')
        print()
        return

    for i in range(s, n+1):
            arr[k] = i
            s = i
            func(k+1)

func(0)