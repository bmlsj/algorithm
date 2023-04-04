## 북, 동, 하, 서 ( 시계방향 )
dx = [-1, 0, 1, 0]
dy = [0, 1, 0, -1]

n, m = map(int, input().split())
r, c, d = map(int, input().split())
arr = [list(map(int, input().split())) for _ in range(n)]

visited = [[0]*m for _ in range(n)]


visited[r][c] = 1
cnt = 1

while True:
    flag = 0           
    for _ in range(4): 
        d = (d+3) % 4  
        nx = r + dx[d]
        ny = c + dy[d]

        if 0 <= nx < n and 0 <= ny < m and arr[nx][ny] == 0:
            if visited[nx][ny] == 0:
                visited[nx][ny] = 1
                cnt += 1
                r = nx
                c = ny
                flag = 1        ## 청소 했다는 뜻
                break

    if flag == 0:               ## 위의 for문에 들어가지 못했을 때
        if arr[r-dx[d]][c-dy[d]] == 1:
            print(cnt)
            break
        else:
            r, c = r-dx[d], c-dy[d]