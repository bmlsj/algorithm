from itertools import combinations

def solution(d, budget):
    
    ans = 0
    sort_d = sorted(d)
    
    for i in sort_d:
        budget -= i
        if budget < 0:
            break
        ans += 1
    
    
    return ans