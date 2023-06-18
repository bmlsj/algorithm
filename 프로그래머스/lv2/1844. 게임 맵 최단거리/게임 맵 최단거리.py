from collections import deque

def solution(maps):
    n, m = len(maps), len(maps[0])

    # 상, 하, 좌, 우
    dx = [-1, 1, 0, 0]
    dy = [0, 0, -1, 1]

    def bfs(a, b):
        queue = deque()
        queue.append((a, b))

        while queue:
            a, b = queue.popleft()
            for i in range(4):
                nx = a + dx[i]
                ny = b + dy[i]

                if nx == n and ny == m:
                    break

                if 0 <= nx < n and 0 <= ny < m and maps[nx][ny] == 1:
                    queue.append((nx, ny))
                    maps[nx][ny] = maps[a][b] + 1 

        return maps[n - 1][m - 1]

    if bfs(0, 0) == 1:
        return -1
    else:
        return bfs(0, 0)


