import sys
from collections import deque

input = sys.stdin.readline

t = int(input())


def bfs():
    queue = deque()
    queue.append((x, y))

    while queue:
        a, b = queue.popleft()
        dx, dy = [-1, -2, -2, -1, 1, 2, 2, 1], [-2, -1, 1, 2, -2, -1, 1, 2]

        for i in range(8):
            nx, ny = a + dx[i], b + dy[i]

            if a == goal_x and b == goal_y:
                return visited[a][b] - 1

            if nx < 0 or nx >= l or ny < 0 or ny >= l:
                continue

            if visited[nx][ny] == 0:
                visited[nx][ny] = visited[a][b] + 1
                queue.append((nx, ny))


for _ in range(t):
    l = int(input())  # 체스판의 크기
    x, y = map(int, input().split())  # 현재 위치
    goal_x, goal_y = map(int, input().split())

    visited = [[0 for _ in range(l)] for _ in range(l)]
    visited[x][y] = 1

    print(bfs())