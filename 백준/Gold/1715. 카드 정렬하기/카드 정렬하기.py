import heapq
import sys

input = sys.stdin.readline

n = int(input())
heap = []

for _ in range(n):
    x = int(input())
    heapq.heappush(heap, x)

ans = 0
if len(heap) == 1:
    print(0)

else:
    ans = 0
    while len(heap) > 1:
        num1 = heapq.heappop(heap)
        num2 = heapq.heappop(heap)
        ans += (num1 + num2)
        heapq.heappush(heap, num1 + num2)

    print(ans)