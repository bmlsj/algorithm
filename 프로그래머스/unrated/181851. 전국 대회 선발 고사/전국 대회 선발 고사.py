def solution(rank, attendance):
    
    ans = []
    for r, t in zip(rank, attendance):
        if t == True:
            ans.append([rank.index(r), r])
    
    ans = sorted(ans, key=lambda k:k[1])
    print(ans)
    return 10000 * ans[0][0] + 100 * ans[1][0] + ans[2][0]
            