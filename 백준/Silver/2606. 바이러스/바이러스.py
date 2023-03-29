import sys
input = sys.stdin.readline

computer = int(input())
m = int(input())
graph = [[] for _ in range(computer+1)]

for _ in range(m):
    a, b = map(int, input().split())

    graph[a].append(b)
    graph[b].append(a)
    graph[a].sort()
    graph[b].sort()

ans = []
# 1번을 통해 웜 바이러스에 걸리게 되는 컴퓨터 수 출력
def dfs(graph, v, virus):
    virus[v] = True
    ans.append(v)
    for i in graph[v]:
        if not virus[i]:
            dfs(graph, i, virus)


virus = [False] * (computer + 1)
dfs(graph, 1, virus)

print(len(ans) - 1)