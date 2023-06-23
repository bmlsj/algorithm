def solution(n, left, right):
    
    cnt = 0
    ans = []
    for i in range((right-left)+1):
        idx = left + i
        row = idx // n
        col = idx % n    

        ans.append(max(col, row) + 1)

    
    return ans