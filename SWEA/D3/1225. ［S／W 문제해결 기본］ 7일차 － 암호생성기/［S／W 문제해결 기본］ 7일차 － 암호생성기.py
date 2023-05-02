
for _ in range(1, 11):
    n = int(input())
    arr = list(map(int, input().split()))

    while True:
        a = True
        
        for k in range(1, 6):
            arr[0] -= k
            arr.append(arr[0])
            arr.remove(arr[0])

            if arr[-1] <= 0:
                a = False
                arr[-1] = 0
                break

        if not a:
            break
            
    arr = map(str, arr)
    print(f"#{n} {' '.join(arr)}")
