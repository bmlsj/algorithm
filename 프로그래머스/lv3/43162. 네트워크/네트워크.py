def solution(n, computers):

    visited = [False] * (n+1)
    
    def dfs(v):
        visited[v] = True
        
        for i in range(n):
            if not visited[i] and computers[v][i] == 1:
                dfs(i)
    
    cnt = 0
    for i in range(n):
        if not visited[i]:
            dfs(i)
            cnt += 1

    return cnt