
arr = [list(map(int, input().split())) for _ in range(9)]
m = max(map(max, arr))
print(m)

for i in range(9):
    for j in range(9):
        if arr[i][j] == m:
            print(i+1, j+1)