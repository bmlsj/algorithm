from collections import deque
f, s, g, u, d = map(int, input().split())


def bfs(v):
    q = deque()
    visited = [-1] * (f + 1)

    q.append(v)
    visited[v] = 0

    while q:
        x = q.popleft()

        if x == g:
            return visited[x]

        move = [u, -d]

        for i in range(2):
            nx = x + move[i]
            if 0 < nx <= f and visited[nx] == -1:
                q.append(nx)
                visited[nx] = visited[x] + 1

    return "use the stairs"


print(bfs(s))