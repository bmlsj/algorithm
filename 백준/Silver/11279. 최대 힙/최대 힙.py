import heapq
import sys
input = sys.stdin.readline

heap = []
max_heap = []

n = int(input())

for _ in range(n):

    s = int(input())

    if s:
        heapq.heappush(max_heap, -s)
    else:
        if len(max_heap) == 0:
            print(0)
        else:
            print(-heapq.heappop(max_heap))