import sys
from collections import deque

input = sys.stdin.readline

# 1xN 크기 미로
n = int(input())
jump = list(map(int, input().split()))
visited = [False] * n

# jump[i]이하만큼 점프 가능
# 최소 몇번 점프를  해야하는 가

def minjump(idx, cnt):

    queue = deque()
    queue.append([idx, cnt])

    while queue:
        idx, cnt = queue.popleft()

        if idx == n-1:
            return cnt
        for i in range(1, jump[idx] + 1):
            if idx + i < n and not visited[idx + i]:
                visited[idx + i] = True
                queue.append((idx + i, cnt + 1))

    return -1


print(minjump(0, 0))
