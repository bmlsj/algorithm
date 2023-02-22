def solution(n):
    
    ans = []
    c = 0
    for i in range(1, n+1):
        c = 0
        for j in range(1, i+1):
            
            if i % j == 0:
                c += 1         

        if c >= 3:
            ans.append(i)
    
    return len(ans)