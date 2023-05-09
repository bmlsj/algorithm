t = int(input())

for i in range(1, t + 1):

    n = int(input())
    arr = [list(input()) for _ in range(n)]
    total = 0

    for j in range(n // 2 + 1):
        total += int(arr[j][n // 2])

        for q in range(1, j + 1):
            total += int(arr[j][n // 2 - q])
            total += int(arr[j][n // 2 + q])

    for j in range(n // 2 + 1, n):
        total += int(arr[j][n // 2])
        for q in range(1, n - j):
            # print(arr[j][n // 2 - q], arr[j][n // 2 + q])
            total += int(arr[j][n // 2 - q])
            total += int(arr[j][n // 2 + q])
            
    print(f"#{i} {total}")

