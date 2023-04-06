from collections import deque

n, m = map(int, input().split())
arr = [list(map(int, input())) for _ in range(n )]
visited = [[False] * (m) for _ in range(n )]
cnt = 0

dx = [-1, 1, 0, 0]
dy = [0, 0, -1, 1]


def bfs(a, b):
    queue = deque()
    queue.append((a, b))
    global cnt

    while queue:
        a, b = queue.popleft()
        for i in range(4):
            nx = a + dx[i]
            ny = b + dy[i]

            if nx == n and ny == m:
                break

            if 0 <= nx < n and 0 <= ny < m and arr[nx][ny] == 1:
                queue.append((nx, ny))
                arr[nx][ny] = arr[a][b] + 1

    return arr[n-1][m-1]


print(bfs(0, 0))

