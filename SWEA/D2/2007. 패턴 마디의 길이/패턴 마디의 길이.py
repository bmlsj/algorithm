t = int(input())
for i in range(1, t + 1):

    arr = list(input())
    stack = []
    next = arr.index(arr[0], 1, 30)

    while stack[:next] != arr[next: 2 * next]:
        stack = []
        for a in range(next):
            stack.append(arr[a])

        if stack[:next] == arr[next: 2 * next]:
            break
        else:
            next = arr.index(arr[0], 2 * next, 30)

    print(f"#{i} {len(stack)}")