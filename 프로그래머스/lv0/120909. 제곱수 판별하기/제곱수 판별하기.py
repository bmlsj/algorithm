def solution(n):
    
    i = 1
    while i * i <= n:
        i += 1
        if i * i == n:
            return 1
            break
            
    
    return 2