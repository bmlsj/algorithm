n, m = map(int, input().split())
arr = [i for i in range(n + 1)]

for _ in range(m):
    a, b = map(int, input().split())
    rev = []
    for i in range(a, b + 1):
        rev.append(arr[i])

    rev = rev[::-1]
    idx = 0
    for i in range(a, b + 1):
        arr[i] = rev[idx]
        idx += 1

for i in range(1, n + 1):
  print(arr[i], end=' ')
