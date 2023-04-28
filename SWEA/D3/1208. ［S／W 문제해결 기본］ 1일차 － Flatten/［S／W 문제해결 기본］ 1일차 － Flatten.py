
for i in range(1, 11):

    dump = int(input())
    arr = list(map(int, input().split()))
    k = 0
    while k != dump:

        m = max(arr)
        n = min(arr)
        k += 1
        arr[arr.index(n)] += 1
        arr[arr.index(m)] -= 1

    print(f"#{i} {max(arr) - min(arr)}")
