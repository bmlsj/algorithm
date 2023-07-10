def solution(a, d, included):
    
    ans = 0
    for n in range(len(included)):
        if included[n]:
            ans += a + n*d
    
    return ans