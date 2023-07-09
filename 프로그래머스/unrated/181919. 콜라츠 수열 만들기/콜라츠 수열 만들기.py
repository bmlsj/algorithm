def solution(n):
    
    ans = [n]
    while n != 1:
        if n % 2 != 0:
            n = 3*n + 1
        else:
            n //= 2
        ans.append(n)
    
    return ans