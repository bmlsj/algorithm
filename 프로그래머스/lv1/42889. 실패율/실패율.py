def solution(N, stages):
    
    # 실패율 : 스테이지에 도달 but 클리어X / 스테이지에 도달 
    ans = []
    for i in range(1, N+1):
        cnt, fail = 0, 0
        for stage in stages:
            if stage >= i:
                cnt += 1
            if stage == i:
                fail += 1
        
        ans.append([i, fail/cnt])
    
    ans = sorted(ans, key=lambda t:-t[1])
    return [ans[i][0] for i in range(len(ans))]