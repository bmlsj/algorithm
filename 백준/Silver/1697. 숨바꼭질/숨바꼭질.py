# 수빈은 : N, 동생은 : K
# 걸을 때 : X + 1, X - 1
# 순간 이동하는 경우 : 2X로 이동
# 수빈이 동생을 찾을 수 있는 가장 빠른 시간이 몇초 후 인가

from collections import deque
import sys

input = sys.stdin.readline

INF = 1000000
n, k = map(int, input().split())
visited = [False for _ in range(INF)]
arr = [0 for _ in range(INF)]


def bfs(x, k):
    q = deque()
    q.append(x)
    visited[x] = True

    while q:
        a = q.popleft()

        move = [1, -1, a]
        for i in range(3):
            dx = a + move[i]
            if not visited[dx] and 0 <= dx < 100001:
                arr[dx] = arr[a] + 1
                q.append(dx)
                visited[dx] = True

        if visited[k]:
            return arr[k]


print(bfs(n, k))
