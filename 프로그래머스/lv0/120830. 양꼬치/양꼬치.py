def solution(n, k):
    
    total = n*12000 + k*2000
    if n >=10:
        total -= (n//10)*2000
    
    return total