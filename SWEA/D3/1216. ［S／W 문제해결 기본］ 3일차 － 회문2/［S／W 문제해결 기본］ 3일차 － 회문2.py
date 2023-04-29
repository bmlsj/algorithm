from collections import deque

for i in range(1, 11):

    n = int(input())
    arr = [list(input()) for _ in range(100)]
    queue = deque()

    def length(x, y, k1, k2):
        global sen, ans
        queue.append([x, y])

        while queue:
            a, b = queue.popleft()
            sen += arr[a][b]
            dx, dy = a + k1, b + k2

            if sen == sen[::-1]:
                ans = max(ans, len(sen))

            if 0 <= dx < 100 and 0 <= dy < 100:
                queue.append([dx, dy])

    ans = 0
    for j in range(100):
        for k in range(100):
            sen = ""
            length(j, k, 0, 1)
            sen = ""
            length(j, k, 1, 0)


    print(f"#{i} {ans}")
