def solution(common):
    
    d1, d2 = common[1] - common[0], common[2] - common[1] 
    n = len(common) + 1
    
    if d1 == d2: # 등차
        an = common[0] + (n - 1) * d1
        return an
    else:
        an = common[len(common)-1] * (common[1] // common[0])
        return an
        