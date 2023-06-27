import sys
from collections import deque
input = sys.stdin.readline

princess = [list(input().rstrip()) for _ in range(5)]


# 1을 찾아 bfs 로 뻗어나가 총 연결된 수가 7인지 확인
def check():

    for i in range(5):
        for j in range(5):
            if visited[i][j] == 1:
                return bfs(i, j)

def bfs(x, y):

    queue = deque()
    check_visited = [[0] * 5 for _ in range(5)]
    queue.append((x, y))
    check_visited[x][y] = 1
    cnt = 1

    while queue:
        a, b = queue.popleft()
        dx, dy = [-1, 1, 0, 0], [0, 0, -1, 1]
        for i in range(4):
            nx = a + dx[i]
            ny = b + dy[i]

            if 0 <= nx < 5 and 0 <= ny <5 and not check_visited[nx][ny] and visited[nx][ny]:
                cnt += 1
                check_visited[nx][ny] = 1
                queue.append([nx, ny])

    # 인접한 좌표가 7개면 True
    return cnt == 7


# 7명이 되고 S가 4개 이상이면 정답
# 2차원을 1차원 형태로 변환해, 7명에 포함할건지 아닌지 25번까지 체크
def dfs(n, cnt, scnt):
    global ans
    
    if cnt > 7:
        return 
    
    if n == 25:
        # 총 7명이 되고, 4명이상이 다솜파일 경우
        if cnt == 7 and scnt >= 4:
            # 인접한지 체크해 모두 인접시 ans += 1
            if check():
                ans += 1
        return

    # 포함하는 경우
    visited[n // 5][n % 5] = 1
    # 다솜파일 경우, 아닐경우 구분
    dfs(n + 1, cnt + 1, scnt + int(princess[n // 5][n % 5] == 'S'))
    # 원상 복구
    visited[n // 5][n % 5] = 0
    # 포함하지 않는 경우
    dfs(n + 1, cnt, scnt)


ans = 0
visited = [[0] * 5 for _ in range(5)]

# 학생번호(0-24번), 포함학생 수, 다솜파 학생수
dfs(0, 0, 0)
print(ans)
