def solution(a, b):
    ans = 0

    if a>=b: 
        a2 = b
        b2 = a
    else: 
        a2 = a
        b2 = b
    
    for i in range(a2, b2+1):
            ans += i
    
    
    return ans