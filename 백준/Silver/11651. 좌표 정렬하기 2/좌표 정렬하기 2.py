
n = int(input())
arr = []
for _ in range(n):
    a, b = map(int, input().split())
    arr.append([a, b])

arr = sorted(arr, key=lambda arr: (arr[1], arr[0]))

for x, y in arr:
    print(x, y)