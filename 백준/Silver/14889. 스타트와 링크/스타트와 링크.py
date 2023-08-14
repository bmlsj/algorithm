import sys
input = sys.stdin.readline

n = int(input())
# 능력치 담은 리스트
powerArr = [list(map(int, input().split())) for _ in range(n)]
ans = 10001
visited = [False] * n


# 조합 함수
def combination(cnt, depth, begin):
    global ans
    if cnt == depth:
        start_power, link_power = 0, 0
        for i in range(n):
            for j in range(n):
                if visited[i] and visited[j]:
                    start_power += powerArr[i][j]
                elif not visited[i] and not visited[j]:
                    link_power += powerArr[i][j]

        ans = min(ans, abs(start_power - link_power))
        return

    for idx in range(begin, n):
        if not visited[idx]:
            visited[idx] = True
            combination(cnt + 1, depth, idx + 1)
            visited[idx] = False


combination(0, n // 2, 0)
print(ans)