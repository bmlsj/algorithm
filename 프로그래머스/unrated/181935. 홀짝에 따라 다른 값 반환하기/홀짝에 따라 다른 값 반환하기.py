def solution(n):
    
    ans = 0
    if n % 2 != 0:
        for i in range(1, n+1):
            if i % 2 != 0:
                ans += i
    else:
        for i in range(1, n+1):
            if i % 2 == 0:
                ans += (i**2)
    
    return ans