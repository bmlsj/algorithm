import sys

seat = []
for i in range(5):
    seat = seat + list(map(str, sys.stdin.readline().rstrip()))
visited = [False] * 25
resList = []
case = 0
count = 0

# 조합으로 7개의 수 뽑기
idxList = []


def combinations(idx, arr, arrIdx):
    if arr.count("Y") >= 4:
        return
    if len(arr) == 7:
        idxList.append(arrIdx)
        return
    for i in range(idx, 25):
        combinations(i + 1, arr + [seat[i]], arrIdx + [i])


combinations(0, [], [])

# dfs 함수
dx = [-5, 5, -1, 1]


def dfs(arr, x, visited):
    global count
    # 방문처리
    visited[x] = True
    count += 1
    if count > 7:
        return

    if count == 7:
        return True
    # 주변 탐색
    for i in range(4):
        nx = x + dx[i]
        if nx < 0 or nx >= 25 or (i == 2 and nx % 5 == 4) or (i == 3 and nx % 5 == 0):  # 상하좌우 값 X
            continue
        if not visited[nx] and nx in arr:
            if dfs(arr, nx, visited):
                return True
    return False


from collections import deque


def bfs(arr, x, visited):
    global count
    queue = deque([x])
    visited[x] = True


# main 함수
for ilist in idxList:
    if dfs(ilist, ilist[0], visited[:]):
        resList.append(ilist)
        case += 1
    count = 0

print(case)
