import sys
input = sys.stdin.readline
sys.setrecursionlimit(10**6)

n = int(input())
tree = [[] for _ in range(n + 1)]

for i in range(n - 1):
    a, b = list(map(int, input().split()))
    if b == 1:
        a, b = b, a
    tree[a].append(b)
    tree[b].append(a)

visited = [False] * (n + 1)

def dfs(v):

    for i in tree[v]:
        if not visited[i]:
            visited[i] = v
            dfs(i)

visited[1] = True
dfs(1)

for v in visited[2:]:
    print(v)