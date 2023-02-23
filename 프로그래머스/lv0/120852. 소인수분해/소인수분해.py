def solution(n):
    
    ans = []
    
    i = 2
    while i <= n:
        if n % i == 0:
            ans.append(i)
            n //= i
            i = 2
        else:
            i += 1
        if n == 1:
            break
    
    return sorted(list(set(ans)))