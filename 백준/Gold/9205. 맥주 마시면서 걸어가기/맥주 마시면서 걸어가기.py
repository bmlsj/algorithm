from collections import deque

t = int(input())

for _ in range(t):

    # 편의점 개수
    n = int(input())
    visited = [False] * (n+1)

    startX, startY = map(int, input().split())
    conveni = [list(map(int, input().split())) for _ in range(n)]
    rockX, rockY = map(int, input().split())
    conveni.append([rockX, rockY])

    def distance(x, y, nx, ny):
        return abs(nx - x) + abs(ny - y)

    def bfs():

        queue = deque()
        if distance(startX, startY, rockX, rockY) <= 1000:
            visited[n] = True
            return

        for i in range(len(conveni)):
            if distance(startX, startY, conveni[i][0], conveni[i][1]) <= 1000:
                queue.append(conveni[i])
                visited[i] = True

        while queue:
            x, y = queue.popleft()

            for i in range(len(conveni)):
                dis = distance(x, y, conveni[i][0], conveni[i][1])
                if dis <= 1000 and not visited[i]:
                    queue.append(conveni[i])
                    visited[i] = True



    bfs()
    print("sad" if not visited[-1] else "happy")