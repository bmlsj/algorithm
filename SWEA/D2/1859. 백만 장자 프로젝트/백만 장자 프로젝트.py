t = int(input())

for i in range(1, t + 1):

    n = int(input())
    arr = list(map(int, input().split()))

    result = 0
    max_value = arr[-1]

    for j in range(n - 2, -1, -1):
        if max_value <= arr[j]:
            max_value = arr[j]
        else:
            result += (max_value - arr[j])

    print(f"#{i} {result}")

