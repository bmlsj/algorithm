def solution(n, k):
    
    ans = []
    for num in range(1, n+1):
        if num % k == 0:
            ans.append(num)
    
    return ans