import sys
import heapq

input = sys.stdin.readline
INF = int(1e6)

# 정점 수, 간선 수
v, e = map(int, input().split())
k = int(input())

# 각 노드 연결 정보를 담은 리스트
graph = [[] for i in range(v + 1)]
# 최단 거리 테이블을 무한으로 초기화
distance = [INF] * (v + 1)

# 모든 간선 정보 입력
# u에서 v로 가는 가중치 w인 간선
for _ in range(e):
    u, v, w = map(int, input().split())
    graph[u].append((v, w))


# 다익스트라 알고리즘 구현
def dijkstra(start):
    q = []

    # 시작 노드로 가기 위한 최단 경로는 0으로 설정해 큐에 삽입
    heapq.heappush(q, (0, start))
    distance[start] = 0

    # 큐가 비어 있지 않다면
    while q:
        # 가장 최단 거리가 짧은 노드에 대한 정보 꺼내기
        dist, now = heapq.heappop(q)

        # 현재 노드가 이미 처리된 적 있는 노드라면 무시
        if distance[now] < dist:
            continue

        # 현재 노드와 연결된 다른 인접 노드들을 화인
        for i in graph[now]:
            cost = dist + i[1]
            # 현재 노드를 거쳐, 다른 노드로 이동하는 거리가 더 짧은 경우
            if cost < distance[i[0]]:
                distance[i[0]] = cost
                heapq.heappush(q, (cost, i[0]))


# 다익스트라 알고리즘 수행
dijkstra(k)

# 모든 노드로 가기 위한 최단 거리를 출력
for i in distance[1:]:
    # 도달할 수 없는 경우, 무한이라고 출력
    if i == INF:
        print("INF")
        # 도달할 수 있는 경우, 거리 출력
    else:
        print(i)

