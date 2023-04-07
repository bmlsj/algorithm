def dfs(v, depth):
    if depth == 6:
        print(*order)
        return
    for i in range(v, k):
        order.append(arr[i])
        dfs(i+1, depth+1)
        order.pop()

while True:
    k, *arr = map(int, input().split())
    if k == 0:
        break

    order = []
    dfs(0, 0)
    print()