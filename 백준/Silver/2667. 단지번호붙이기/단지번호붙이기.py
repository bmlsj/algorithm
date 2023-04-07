n = int(input())
arr = [list(map(int, input())) for _ in range(n)]
visited = [[False for _ in range(n + 1)] for _ in range(n + 1)]


def dfs(x, y):

    if x < 0 or x >= n or y < 0 or y >= n:
        return False
    if arr[x][y] == 1:
        global cnt
        arr[x][y] = 0
        cnt += 1
        dfs(x - 1, y)
        dfs(x + 1, y)
        dfs(x, y + 1)
        dfs(x, y - 1)
        return True
    return False


k = 0
cnt = 0
cnt_list = []
for i in range(n):
    for j in range(n):
        if dfs(i, j):
            cnt_list.append(cnt)
            k += 1
            cnt = 0

print(k)
cnt_list.sort()
for i in cnt_list:
    print(i)