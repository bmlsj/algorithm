def solution(k, m, score):
    
    # 1 ~ k점
    # m개씩 포장 / 점수 : 낮은 점수 p * m
    
    score.sort()
    sc = 0
    while len(score) >= m:
        ans = []
        for _ in range(m):
            ans.append(score.pop())

        sc += (min(ans) * m)
    
    return sc
        
        