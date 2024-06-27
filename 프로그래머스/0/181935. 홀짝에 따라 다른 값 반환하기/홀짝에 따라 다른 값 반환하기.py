def solution(n):
    
    ans = 0
    if n % 2 != 0:
        return sum(range(1, n+1, 2))
            
    return sum(i*i for i in range(2, n+1, 2))
    
    return ans