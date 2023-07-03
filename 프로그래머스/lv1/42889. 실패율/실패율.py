def solution(N, stages):
    # 실패율 : 스테이지에 도달 but 클리어X / 스테이지에 도달
    stages.sort()
    ans = []
    for i in range(1, N + 1):
        cnt, fail = 0, 0
        for stage in stages:
            if stage >= i:
                cnt += 1
            if stage == i:
                fail += 1

        if fail == len(stages) - 1:
            ans.append([i, 1])
        elif cnt == 0:
            ans.append([i, 0])
        else:
            ans.append([i, fail / cnt])
    
    ans = sorted(ans, key=lambda t: -t[1])
    return [ans[i][0] for i in range(len(ans))] 