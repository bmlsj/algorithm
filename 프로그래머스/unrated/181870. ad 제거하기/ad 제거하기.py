def solution(strArr):
    
    ans = []
    for s in strArr:
        if 'ad' not in s:
            ans.append(s)
    
    return ans