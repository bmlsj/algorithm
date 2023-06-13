import heapq
import sys
input = sys.stdin.readline
INF = int(1e9)

def dijkstra(start):
    q = []
    heapq.heappush(q, (0, start))
    distance[start] = 0

    while q:
        dist, now = heapq.heappop(q)

        if dist > distance[now]:
            continue

        for i in graph[now]:
            cost = dist + i[1]
            if cost < distance[i[0]]:  # INF일 경우, cost 값(최소값)으로 변경
                distance[i[0]] = cost
                heapq.heappush(q, (cost, i[0]))


n, d = map(int, input().split())
graph = [[] for _ in range(d + 1)]
distance = [INF] * (d + 1)

for i in range(d):
    graph[i].append((i + 1, 1))

for _ in range(n):
    start, arrive, fast = map(int, input().split())
    
    # 도착 지점이 d보다 크면 continue
    if arrive > d:
        continue

    graph[start].append((arrive, fast))


dijkstra(0)
print(distance[-1])
