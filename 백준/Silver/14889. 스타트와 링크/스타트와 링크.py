import sys

input = sys.stdin.readline

n = int(input())
# 능력치 담은 리스트
powerArr = [list(map(int, input().split())) for _ in range(n)]
numlist = [i for i in range(n)]
ans = 10001
visited = [False] * n


# 조합 함수
def combination(cnt, depth, begin):
    global ans
    if cnt == depth:
        power = 0
        for i in range(n):
            for j in range(n):
                if visited[i] and visited[j]:
                    power += powerArr[i][j]
                elif not visited[i] and not visited[j]:
                    power -= powerArr[i][j]

        ans = min(ans, abs(power))
        return

    for idx in range(begin, n):
        visited[idx] = True
        combination(cnt + 1, depth, idx + 1)
        visited[idx] = False


combination(0, n // 2, 0)
print(ans)