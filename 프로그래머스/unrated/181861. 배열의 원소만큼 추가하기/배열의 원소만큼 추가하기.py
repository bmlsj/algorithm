def solution(arr):
    
    ans = []
    for n in arr:
        for _ in range(n):
            ans.append(n)
    
    return ans