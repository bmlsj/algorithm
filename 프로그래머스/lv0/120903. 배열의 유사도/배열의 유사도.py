def solution(s1, s2):
    
    cnt = 0
    for c1 in s1:
        for c2 in s2:
            if c1 == c2:
                cnt += 1
    
    return cnt