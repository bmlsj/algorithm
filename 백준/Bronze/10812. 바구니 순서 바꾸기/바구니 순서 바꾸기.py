

m, n = map(int, input().split())
arr = [i for i in range(1, m+1)]

for _ in range(n):
    i, j, k = map(int, input().split())

    # k가 기준
    rev = arr[k-1:j] + arr[i-1:k-1]

    idx = 0
    for n in range(i-1, j):
        arr[n] = rev[idx]
        idx += 1

arr = map(str, arr)
print(' '.join(arr))