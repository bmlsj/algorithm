def solution(brown, yellow):
    
    total = brown + yellow
    
    ans = []
    for i in range(1, total // 2 + 1):
        if total % i == 0 and (i*2 + (total//i - 2)*2) == brown:
            ans.append(i)
    
    if len(ans) == 1:
        return [ans[0], ans[0]]
    else:
        return sorted(ans, reverse=True)