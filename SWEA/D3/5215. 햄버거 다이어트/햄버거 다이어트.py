t = int(input())

for i in range(1, t + 1):

    n, l = map(int, input().split())  # 재료 수, 제한 칼로리
    cal = []
    for _ in range(n):
        # 점수, 칼로리
        cal.append(list(map(int, input().split())))

    # best : 점수는 높지만 칼로리는 낮은 것
    cal = sorted(cal, key=lambda c: c[1])
    total = 0

    def dfs(idx, score, calo):
        global total

        if calo > l:
            return

        if idx >= n:
            if score > total:
                total = score
            return

        dfs(idx + 1, score + cal[idx][0], calo + cal[idx][1])
        dfs(idx + 1, score, calo)

    dfs(0, 0, 0)
    print(f"#{i} {total}")
